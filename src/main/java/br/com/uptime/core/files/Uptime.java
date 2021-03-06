package br.com.uptime.core.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class Uptime {
	
	private static String system = null;
	private static String clockStart = null;
	private static String clockFinish = null;
	private static String statusTest = null;
	
	PropertiesConfig propertiesConfig = new PropertiesConfig();
	final Logger logger = Logger.getLogger(Uptime.class);
	
	/**
	 *	Método responsável por criar o csv para logger de execução.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public void load() throws IOException {
		
		final String path = propertiesConfig.getProperties("application.properties").getProperty("app.dir.logger") + "logger_uptime.csv";
		File file = new File(path);
		
		try {
			if (!file.exists()) {
				file.createNewFile();
				FileWriter fw = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("SYSTEM;START;FINISH;STATUS");
				bw.newLine();
				bw.close();
				fw.close();
			}
		
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(this.getSystem() + ";" + this.getClockStart() + ";" + this.getClockFinish() + ";" + this.getStatus());
		bw.newLine();
		bw.close();
		fw.close();
		 
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void setSystem(String sistema) {
		 system = sistema;
	}
	
	public void setClockStart(String clock) {
		clockStart = clock;
	}
	
	public void setClockFinish(String clock) {
		clockFinish = clock;
	}
	
	public void setStatus(String status) {
		statusTest = status;
	}
	
	/**
	 *	Método responsável por disponibilizar o sistema.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public String getSystem() {
		return system;
	}

	/**
	 *	Método responsável por disponibilizar o horaInicio.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public String getClockStart() {
		return clockStart;
	}

	/**
	 *	Método responsável por disponibilizar o horaFinal.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public String getClockFinish() {
		return clockFinish;
	}

	/**
	 *	Método responsável por disponibilizar o status da execução.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public String getStatus() {
		return statusTest;
	}
	
	/**
	 *	Método responsável por pegar a data atual da maquina.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public String getDateNow() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateNow = formatter.format(date);
		return dateNow;
	}
	
}
