package de.grundid.recycling;

import org.codehaus.jackson.map.ObjectMapper;
import org.osmtools.dataimport.ImportHandler;
import org.osmtools.dataimport.SimpleImporter;

public class Import {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		RecyclingReader recyclingReader = new RecyclingReader();
		RecyclingConsumer consumer = new RecyclingConsumer();
		ImportHandler<RecyclingData> importHandler = new ImportHandler<RecyclingData>();
		importHandler.setConsumer(consumer);
		importHandler.setProducer(recyclingReader);
		importHandler.setDefaultQueueSize(100);
		SimpleImporter importer = new SimpleImporter();
		importer.run(args[0], importHandler);

		System.out.println();
		try {
			System.out.println(objectMapper.writeValueAsString(consumer.getData()));
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Total Objects: " + recyclingReader.getObjectCount());
	}
}
