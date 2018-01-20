package br.com.uptime.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {

	private static PropertiesConfig propertiesConfig = new PropertiesConfig();
	private BufferedReader reader;
	private List<String> lines = new ArrayList<>();

	public ReadFile(String nameFile, String typeFile) throws IOException {
		this.reader = load(nameFile, typeFile);
		lines = reader.lines().collect(Collectors.toList());
	}

	private static BufferedReader load(String nameFile, String typeFile) throws IOException {
		final String path = propertiesConfig.getProperties().getProperty("app.dir.files") + nameFile + "." + typeFile.toLowerCase();
		InputStream fis = new FileInputStream(new File(path));
		return new BufferedReader(new InputStreamReader(fis));
	}

	public List<String> getValuePosition(int initial, int finaly) throws IOException {
		List<String> values = new ArrayList<>();
		lines.forEach(l -> values.add(l.substring(initial, finaly)));
		return values;
	}
	
	public List<String> getValuePositionSee(String see, int initial, int finaly) throws IOException {
		List<String> values = new ArrayList<>();
		lines.forEach(l ->{
			final String text = l.substring(initial, finaly);
			if(text.equalsIgnoreCase(see)){
				values.add(text);
			}
		});
		return values;
	}
}
