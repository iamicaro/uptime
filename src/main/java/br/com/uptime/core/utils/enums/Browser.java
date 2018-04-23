package br.com.uptime.core.utils.enums;

import static java.util.Arrays.*;

public enum Browser {

	INTERNET_EXPLORE("internet-explore"), CHROME("chrome"), FIREFOX("firefox");
	
	private String browser = null;
	
	Browser(String browser) {
		this.browser = browser;
	}
	
	public String getBrowser() {
		return this.browser;
	}
	
	public static Browser getBrowserByDescription(String navegador) {
		return stream(values()).filter(browser -> browser.getBrowser().equalsIgnoreCase(navegador)).findFirst().get();
	}
	
}
