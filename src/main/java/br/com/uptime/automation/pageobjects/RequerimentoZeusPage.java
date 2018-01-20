package br.com.uptime.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.uptime.core.command.CommandWebDriver;

public class RequerimentoZeusPage {

	public WebElement getIdentificacao() {
		final String xpath = "//input[@id='fun_Id']";
		return CommandWebDriver.getWebDriver().findElement(By.xpath(xpath));
	}
	
	public WebElement getSenha() {
		final String xpath = "//input[@id='fun_Senha']";
		return CommandWebDriver.getWebDriver().findElement(By.xpath(xpath));
	}
	
	public WebElement getContinuar() {
		final String xpath = "//input[@id='btnSubmitLogn']";
		return CommandWebDriver.getWebDriver().findElement(By.xpath(xpath));
	}
	
}
