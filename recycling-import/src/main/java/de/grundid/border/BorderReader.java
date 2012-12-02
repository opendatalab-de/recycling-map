package de.grundid.border;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osmtools.dataimport.BlockingQueueDefaultHandler;
import org.osmtools.ra.analyzer.AggregatedSegment;
import org.osmtools.ra.analyzer.AggregationService;
import org.osmtools.ra.analyzer.RelationMemberService;
import org.osmtools.ra.data.Member;
import org.osmtools.ra.data.Node;
import org.osmtools.ra.data.Relation;
import org.osmtools.ra.data.Way;
import org.osmtools.ra.graph.Graph;
import org.osmtools.ra.graph.GraphService;
import org.osmtools.ra.graph.IntersectionNode;
import org.osmtools.ra.segment.ConnectableSegment;
import org.osmtools.ra.segment.SegmentFactory;
import org.osmtools.ra.traverse.TraverseService;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class BorderReader extends BlockingQueueDefaultHandler<BorderData> {

	private Map<Long, Node> nodes = new HashMap<Long, Node>();
	private Map<Long, Way> ways = new HashMap<Long, Way>();

	private Set<String> ignoreKeys = new HashSet<String>();
	private BorderData data;
	private List<Long> wayMembers = new ArrayList<Long>();
	private Way way;
	private long objectCount;

	private RelationMemberService relationMemberService = new RelationMemberService(new SegmentFactory());
	private AggregationService aggregationService = new AggregationService();
	private GraphService graphService = new GraphService();
	private TraverseService traverseService = new TraverseService();

	public BorderReader() {
		ignoreKeys.add("created_by");
		ignoreKeys.add("source");
	}

	private long parseLongSafe(String s) {
		try {
			return Long.parseLong(s);
		}
		catch (Exception e) {
			return 0;
		}
	}

	private float parseFloatSafe(String s) {
		try {
			return Float.parseFloat(s);
		}
		catch (Exception e) {
			return 0;
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		char c = qName.charAt(0);
		if (c == 't') // tag
		{
			if (data != null) {
				String k = attributes.getValue("k");
				String v = attributes.getValue("v");
				if (!ignoreKeys.contains(k))
					data.getTags().put(k, v);
			}
		}
		else if (c == 'n' && !qName.equals("nd")) // node
		{
			Long nodeId = parseLongSafe(attributes.getValue("id"));
			Node node = new Node(nodeId.longValue(), parseFloatSafe(attributes.getValue("lat")),
					parseFloatSafe(attributes.getValue("lon")));
			nodes.put(nodeId, node);
		}
		else if (c == 'n' && qName.equals("nd")) // nd within way
		{
			long nodeId = parseLongSafe(attributes.getValue("ref"));
			Node node = nodes.get(Long.valueOf(nodeId));
			if (node != null)
				way.addNode(node);
			else
				throw new RuntimeException("No node with id " + nodeId);
		}
		else if (c == 'r') {
			data = new BorderData(parseLongSafe(attributes.getValue("id")));
		}
		else if (c == 'm') { // member
			String type = attributes.getValue("type");
			if ("way".equals(type)) {
				wayMembers.add(parseLongSafe(attributes.getValue("ref")));
			}
		}
		else if (c == 'w') { // way
			way = new Way(parseLongSafe(attributes.getValue("id")));
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		char c = qName.charAt(0);
		if (c == 'r') {
			if (data != null) {
				Map<String, String> keyValues = data.getTags();
				String boundary = keyValues.get("boundary");
				String adminLevel = keyValues.get("admin_level");
				if ("administrative".equals(boundary) && ("8".equals(adminLevel) || "9".equals(adminLevel))) {
					try {

						List<Member> members = new ArrayList<Member>();

						for (Long memberId : wayMembers) {
							Way wayMember = ways.get(memberId);
							if (wayMember != null) {
								Member member = new Member(wayMember, "");
								members.add(member);
							}
							else
								System.out.println("Unknown way id " + memberId);
						}

						Relation relation = new Relation(data.getId(), members, Calendar.getInstance(), "", keyValues);

						List<List<Node>> polygons = convertRelationToPolygon(relation);
						data.setPolygons(polygons);

						queue.put(data);
						objectCount++;
					}
					catch (InterruptedException e) {
					}
				}
				data = null;
				wayMembers.clear();
			}
			else
				throw new RuntimeException("unexpected node end tag");
		}
		else if (c == 'w') {
			ways.put(way.getId(), way);
		}
	}

	private List<List<Node>> convertRelationToPolygon(Relation relation) {
		List<ConnectableSegment> segments = relationMemberService.createSegmentsOutOfRelationMembers(relation);

		List<AggregatedSegment> aggregateSegments = aggregationService.aggregateSegments(segments);
		List<Graph> graphs = graphService.createGraphs(aggregateSegments);

		List<List<Node>> polygons = new ArrayList<List<Node>>();
		for (Graph graph : graphs) {
			IntersectionNode[] intersectionNodes = graph.getLeaves().toArray(new IntersectionNode[0]);
			if (intersectionNodes.length == 2 || intersectionNodes.length == 1) {

				IntersectionNode startNode = intersectionNodes[0];
				IntersectionNode endNode = intersectionNodes.length == 1 ? startNode : intersectionNodes[1];

				List<Node> nodes = traverseService.traverse(startNode, endNode);
				List<Node> completeNodeList = traverseService.fillInNodes(nodes, segments);

				polygons.add(completeNodeList);
			}
			else {
				throw new RuntimeException("Cannot traverse " + relation.getRelationId());
			}
		}

		return polygons;
	}

	public long getObjectCount() {
		return objectCount;
	}
}
