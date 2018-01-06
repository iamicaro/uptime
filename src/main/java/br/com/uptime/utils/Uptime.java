package br.com.uptime.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class Uptime {
	
	private static String sistema = null;
	private static String horaInicio = null;
	private static String horaFinal = null;
	private static String status = null;
	
	PropertiesConfig propertiesConfig = new PropertiesConfig();
	final Logger logger = Logger.getLogger(Uptime.class);
	
	/**
	 *	Método responsável por criar o csv para logger de execução.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public void update() throws IOException {
		
		String diretorio = propertiesConfig.getProperties().getProperty("app.dir.logger");
		File arquivo = new File(diretorio + "logger_uptime.csv");
		
		try {
			if (!arquivo.exists()) {
				arquivo.createNewFile();
				FileWriter fw = new FileWriter(arquivo, true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("SISTEMA;INICIO;FIM;STATUS");
				bw.newLine();
				bw.close();
				fw.close();
			}
		 
		FileWriter fw = new FileWriter(arquivo, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(this.getSistema() + ";" + this.getHoraInicio() + ";" + this.getHoraFinal() + ";" + this.getStatus());
		bw.newLine();
		bw.close();
		fw.close();
		
		FileReader fr = new FileReader(arquivo);
		BufferedReader br = new BufferedReader(fr);
		 
		br.close();
		fr.close();
		 
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	@SuppressWarnings("static-access")
	public void setSistema(String sistema) {
		 this.sistema = sistema;
	}
	
	@SuppressWarnings("static-access")
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	@SuppressWarnings("static-access")
	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}
	
	@SuppressWarnings("static-access")
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 *	Método responsável por disponibilizar o sistema.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public String getSistema() {
		return sistema;
	}

	/**
	 *	Método responsável por disponibilizar o horaInicio.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public String getHoraInicio() {
		return horaInicio;
	}

	/**
	 *	Método responsável por disponibilizar o horaFinal.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public String getHoraFinal() {
		return horaFinal;
	}

	/**
	 *	Método responsável por disponibilizar o status da execução.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public String getStatus() {
		return status;
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
