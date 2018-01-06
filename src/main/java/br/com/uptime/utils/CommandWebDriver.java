package br.com.uptime.utils;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	public static void loadWebDriver() {
 		System.setProperty(Constants.KEY, Constants.CHROME_DRIVER);
		driver = new ChromeDriver();
	}
	
	/**
	 *	Método responsável por disponibilizar o webdriver carregado.
	 * 
	 * @since 28/12/2017
	 * @author Ícaro Silva
	 * @throws IOException
	 */
	public static WebDriver getWebDriver() {
		return driver;
	}
}
