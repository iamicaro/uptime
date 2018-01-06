package br.com.uptime.steps;

import java.io.IOException;
import java.nio.file.Paths;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import core.CommandWebDriver;
import core.Uptime;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	Uptime uptime = new Uptime();
	
	@Before
	public void initialize(Scenario scenario) {
		PropertyConfigurator.configure(Paths.get("").toAbsolutePath().toString() + "\\src\\main\\resources\\log4j.properties");
		CommandWebDriver.loadWebDriver();
		Logger.getLogger("org.openqa.selenium.remote").setLevel(Level.OFF);
		uptime.setHoraInicio(uptime.getDateNow());
	}
	
	@After
	public void finalize(Scenario scenario) throws InterruptedException, IOException {
		uptime.setHoraFinal(uptime.getDateNow());
		CommandWebDriver.getWebDriver().quit();
		uptime.setStatus(scenario.isFailed() ? "FAILED" : "PASSED");
		uptime.update();
	}
	
}
