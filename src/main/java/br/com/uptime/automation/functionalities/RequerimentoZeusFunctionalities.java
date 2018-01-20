package br.com.uptime.automation.functionalities;

import br.com.uptime.automation.actions.RequerimentoZeusAction;
import br.com.uptime.core.command.CommandWebDriver;

public class RequerimentoZeusFunctionalities {
	
	RequerimentoZeusAction requerimentoZeusAction = new RequerimentoZeusAction();
	
	public void pageZeus() {
		CommandWebDriver.getWebDriver().get("https://aplic.inmetrics.com.br//requerimento/content/login.php");
	}
	
	public void login() {		
		requerimentoZeusAction.getIdentificacao("");
		requerimentoZeusAction.getSenha("");
		requerimentoZeusAction.getContinuar();
	}
}
