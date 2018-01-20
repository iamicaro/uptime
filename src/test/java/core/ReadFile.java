package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile {
	
	private static PropertiesConfig propertiesConfig = new PropertiesConfig();
	
	public static BufferedReader load(String nameFile, String typeFile) throws IOException {
		final String path = propertiesConfig.getProperties().getProperty("app.dir.teste") + nameFile + "." + typeFile.toLowerCase();
		InputStream fis = new FileInputStream(new File(path));
	
		return new BufferedReader(new InputStreamReader(fis));
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = load("teste", "txt");
		String line;
		StringBuilder out = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            out.append(line.substring(0, 23));
            out.append("\n");
        }
        System.out.println(out.toString());
        reader.close();
 
	}
}
