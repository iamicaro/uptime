package br.com.uptime.automation.actions;

import br.com.uptime.automation.pageobjects.RequerimentoZeusPage;

public class RequerimentoZeusAction {
	
	RequerimentoZeusPage requerimentoZeusPage = new RequerimentoZeusPage();

	public void getIdentificacao(String identificacao) {
		requerimentoZeusPage.getIdentificacao().sendKeys(identificacao);
	}
	
	public void getSenha(String senha) {
		requerimentoZeusPage.getIdentificacao().sendKeys(senha);
	}
	
	public void getContinuar() {
		requerimentoZeusPage.getIdentificacao().click();
	}
	
}
