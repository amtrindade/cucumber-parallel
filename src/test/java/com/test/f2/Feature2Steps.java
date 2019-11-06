package com.test.f2;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Feature2Steps {
	long SLEEP=1000L;
	
	@Dado("que a análise esteja sendo preparada {int}")
	public void que_a_analise_esteja_sendo_preparada(int scenario) throws InterruptedException {
		Thread.sleep(SLEEP);
        System.out.format("f2 1 - cenário: "+scenario+" - Thread ID: %2d\n", Thread.currentThread().getId());
	}

	@Quando("eu realizo alguma ação {int}")
	public void eu_realizo_alguma_acao(int scenario) throws InterruptedException {
		Thread.sleep(SLEEP);
		System.out.format("f2 2 - cenário: "+scenario+" - Thread ID: %2d\n", Thread.currentThread().getId());
	}


	@Entao("os dados são listados {int}")
	public void os_dados_são_listados(int scenario) throws InterruptedException {
		Thread.sleep(SLEEP);
		System.out.format("f2 3 - cenário: "+scenario+" - Thread ID: %2d\n", Thread.currentThread().getId());
	}

}
