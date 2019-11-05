package com.test.f2;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Feature2Steps {
	long SLEEP=1000L;
	
	@Dado("que a análise esteja sendo preparada")
	public void que_a_analise_esteja_sendo_preparada() throws InterruptedException {
		Thread.sleep(SLEEP);
        System.out.format("f2 1 - cenário:1 - Thread ID: %2d\n", Thread.currentThread().getId());
	}

	@Quando("eu realizo alguma ação")
	public void eu_realizo_alguma_acao() throws InterruptedException {
		Thread.sleep(SLEEP);
		System.out.format("f2 2 - cenário:1 - Thread ID: %2d\n", Thread.currentThread().getId());
	}


	@Entao("os dados são listados")
	public void os_dados_são_listados() throws InterruptedException {
		Thread.sleep(SLEEP);
		System.out.format("f2 3 - cenário:1 - Thread ID: %2d\n", Thread.currentThread().getId());
	}

}
