package br.com.uptime.core.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertiesConfig {

	final Logger logger = Logger.getLogger(PropertiesConfig.class);
	
	/**
	 *	Método responsável por disponibilizar o Properties
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public Properties getProperties(String filePath) {
		Properties props = null;
		try {
			props = this.getProps(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
	
	/**
	 *	Método responsável por configurar aonde o properties deve procurar as informações.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	private Properties getProps(String filePath) throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(
				"./src/main/resources/" + filePath);
		props.load(file);
		return props;
	}
}
