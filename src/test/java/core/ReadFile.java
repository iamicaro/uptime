package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	static PropertiesConfig propertiesConfig = new PropertiesConfig();

	public static void load() throws IOException {
		String diretorio = propertiesConfig.getProperties().getProperty("app.dir.teste");
		File arquivo = new File(diretorio);
		
		FileReader fr = new FileReader(arquivo);
		BufferedReader br = new BufferedReader(fr);
		
		while(br.ready()) {
		String a = br.readLine().substring(0, 49);
		String i = br.readLine().substring(50, 52);
		
		System.out.println("NOME: " + a);
		System.out.println("IDADE: " + i + "\n\n");
		
		}
		
		br.close();
		fr.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		ReadFile.load();
	}
	
}
