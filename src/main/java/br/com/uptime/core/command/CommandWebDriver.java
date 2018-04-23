package br.com.uptime.core.command;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.uptime.core.utils.Constants;
import br.com.uptime.core.utils.enums.Browser;

public class CommandWebDriver {

	final Logger logger = Logger.getLogger(CommandWebDriver.class);
	
	private static WebDriver driver;
	
	/**
	 *	Método responsável por carregar o WebDriver.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public static void createInstance(Browser browser) {
 		
		System.setProperty(Constants.KEY, Constants.CHROME_DRIVER);
 		
 		switch(browser) {
 		
 		case CHROME:
 		
 			driver = new ChromeDriver();
 			break;
 			
 		case INTERNET_EXPLORE:
 			
 		case FIREFOX:	
 		
 		} 
	}
	
	/**
	 *	Método responsável por disponibilizar o webdriver carregado.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public static WebDriver getInstance() {
		return driver;
	}
	
	/**
	 *	Método responsável por navegar pela url.
	 * 
	 * @since 22/04/2018
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public static void navigate(String url) {
		driver.get(url);
	}
	
	/**
	 *	Método responsável por fechar o webdriver
	 * 
	 * @since 22/04/2018
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public static void quit() {
		driver.quit();
	}
	
}
