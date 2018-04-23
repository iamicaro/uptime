package br.com.uptime.automation.actions.zeus;

import br.com.uptime.automation.pageobjects.zeus.RequerimentoZeusPage;

public class RequerimentoZeusAction {
	
	RequerimentoZeusPage requerimentoZeusPage = new RequerimentoZeusPage();

	public void setIdentificacao(String identificacao) {
		requerimentoZeusPage.getIdentificacao().sendKeys(identificacao);
	}
	
	public void setSenha(String senha) {
		requerimentoZeusPage.getIdentificacao().sendKeys(senha);
	}
	
	public void setContinuar() {
		requerimentoZeusPage.getIdentificacao().click();
	}
	
}
