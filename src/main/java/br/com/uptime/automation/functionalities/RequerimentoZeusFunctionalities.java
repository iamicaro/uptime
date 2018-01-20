package br.com.uptime.automation.functionalities;

import br.com.uptime.automation.actions.RequerimentoZeusAction;
import br.com.uptime.core.command.CommandWebDriver;
import br.com.uptime.core.files.Uptime;

public class RequerimentoZeusFunctionalities {
	
	RequerimentoZeusAction requerimentoZeusAction = new RequerimentoZeusAction();
	Uptime uptime = new Uptime();
	
	public void pageZeus() {
		uptime.setSystem("ZEUS");
		CommandWebDriver.getWebDriver().get("https://aplic.inmetrics.com.br//requerimento/content/login.php");
	}
	
	public void login() {		
		requerimentoZeusAction.getIdentificacao("43843056803");
		requerimentoZeusAction.getSenha("43843056803");
		requerimentoZeusAction.getContinuar();
	}
	
	public void validarPaginaInicial()  {
		System.out.println("ACERTOU!!");
	}
}
