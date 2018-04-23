package br.com.uptime.automation.steps;

import java.io.IOException;
import java.nio.file.Paths;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import br.com.uptime.core.command.CommandWebDriver;
import br.com.uptime.core.files.PropertiesConfig;
import br.com.uptime.core.files.Uptime;
import br.com.uptime.core.utils.enums.Browser;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	Uptime uptime = new Uptime();
	PropertiesConfig properties = new PropertiesConfig();
	
	@Before
	public void initialize(Scenario scenario) {
		PropertyConfigurator.configure(Paths.get("").toAbsolutePath().toString() + "\\src\\main\\resources\\log4j.properties");
		
		final String browser = properties.getProperties("application.properties").getProperty("app.browser.driver");
		
		CommandWebDriver.createInstance(Browser.getBrowserByDescription(browser));
		
		Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);
		
		uptime.setClockStart(uptime.getDateNow());
	}
	
	@After
	public void finalize(Scenario scenario) throws InterruptedException, IOException {
		uptime.setClockFinish(uptime.getDateNow());
		uptime.setStatus(scenario.isFailed() ? "FAILED" : "PASSED");
		uptime.load();
		CommandWebDriver.getInstance().quit();
	}
	
}
