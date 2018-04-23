package br.com.uptime.automation.steps.zeus;

import br.com.uptime.automation.functionalities.zeus.RequerimentoZeusFunctionalities;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RequerimentoZeusSteps {

	RequerimentoZeusFunctionalities requerimentoZeusFunctionalities = new RequerimentoZeusFunctionalities();
	
	@Dado("^que esteja na pagina de login no Zeus$")
	public void pageZeus() {
		requerimentoZeusFunctionalities.pageZeus();
	}
	
	@Quando("^logar no Zeus$")
	public void login() {
		requerimentoZeusFunctionalities.login();
	}
	
	@Entao("^validar pagina inicial$")
	public void validarPaginaInicial() {
		
	}
}
