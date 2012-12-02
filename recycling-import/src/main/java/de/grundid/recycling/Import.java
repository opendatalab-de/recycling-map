package de.grundid.recycling;

import java.io.File;
import java.io.FileWriter;

import org.osmtools.dataimport.ImportHandler;
import org.osmtools.dataimport.SimpleImporter;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

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

		try {
			FileWriter writer = new FileWriter(new File("import-output.json"));

			ObjectWriter prettyWriter = objectMapper.writer(new DefaultPrettyPrinter());

			writer.write(prettyWriter.writeValueAsString(consumer.getData()));
			writer.flush();
			writer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Total Objects: " + recyclingReader.getObjectCount());
	}
}
