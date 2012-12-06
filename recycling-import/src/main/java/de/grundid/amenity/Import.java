package de.grundid.amenity;

import org.osmtools.dataimport.ImportHandler;
import org.osmtools.dataimport.SimpleImporter;

import de.grundid.utils.GrabUtils;

public class Import {

	public static void main(String[] args) {

		AmenityReader reader = new AmenityReader();
		OsmObjectListConsumer<AmenityData> consumer = new OsmObjectListConsumer<AmenityData>();
		ImportHandler<AmenityData> importHandler = new ImportHandler<AmenityData>();
		importHandler.setConsumer(consumer);
		importHandler.setProducer(reader);
		importHandler.setDefaultQueueSize(100);
		SimpleImporter importer = new SimpleImporter();
		importer.run(args[0], importHandler);

		GrabUtils.writeJsonObject(consumer.getData(), "import-bakery.json");

		System.out.println("Total Objects: " + reader.getObjectCount());
	}
}
