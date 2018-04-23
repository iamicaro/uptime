package br.com.uptime.automation.functionalities.zeus;

import br.com.uptime.automation.actions.zeus.RequerimentoZeusAction;
import br.com.uptime.core.command.CommandWebDriver;
import br.com.uptime.core.files.PropertiesConfig;
import br.com.uptime.core.files.Uptime;

public class RequerimentoZeusFunctionalities {
	
	Uptime uptime = new Uptime();
	PropertiesConfig properties = new PropertiesConfig();
	RequerimentoZeusAction requerimentoZeusAction = new RequerimentoZeusAction();
	
	public void pageZeus() {
		uptime.setSystem("ZEUS");
		CommandWebDriver.navigate("");
		
	}
	
	public void login() {		
		requerimentoZeusAction.setIdentificacao("43843056803");
		requerimentoZeusAction.setSenha("261979");
		requerimentoZeusAction.setContinuar();
	}
	
	public void validarPaginaInicial()  {
		System.out.println("ACERTOU!!");
	}
}
