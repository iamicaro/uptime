package core;

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
	public Properties getProperties() throws IOException {
		Properties props = this.getProps();
		return props;
	}
	
	/**
	 *	Método responsável por configurar aonde o properties deve procurar as informações.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	private Properties getProps() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(
				"./src/main/resources/application.properties");
		props.load(file);
		return props;
	}
}
