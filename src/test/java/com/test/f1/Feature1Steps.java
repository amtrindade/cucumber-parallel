package com.test.f1;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Feature1Steps {
	long SLEEP=1000L;

	@Dado("que os dados estejam sendo preparados")
	public void que_os_dados_estejam_sendo_preparados() throws InterruptedException {
		Thread.sleep(SLEEP);
        System.out.format("f1 a - cenário: 1 - Thread ID: %2d\n", Thread.currentThread().getId());
	}

	@Quando("eu realizo uma ação")
	public void eu_realizo_uma_ação() throws InterruptedException {
		Thread.sleep(SLEEP);
		System.out.format("f1 b - cenário: 1 - Thread ID: %2d\n", Thread.currentThread().getId());
	}

	@Entao("os dados são processados")
	public void os_dados_são_processados() throws InterruptedException {
		Thread.sleep(SLEEP);
		System.out.format("f1 c - cenário: 1 - Thread ID: %2d\n", Thread.currentThread().getId());
	}
	
	@Dado("que os dados estejam sendo preparados para o cenário {int}")
	public void que_os_dados_estejam_sendo_preparados_para_o_cenário(int step) throws InterruptedException {
		Thread.sleep(SLEEP);
        System.out.format("f1 a1 - cenário: "+step+" - Thread ID: %2d\n", Thread.currentThread().getId());
	}

	@Quando("eu realizo uma ação temporária {int}")
	public void eu_realizo_uma_ação_temporária(int step) throws InterruptedException {
		Thread.sleep(SLEEP);
		System.out.format("f1 b2 - cenário: "+step+" - Thread ID: %2d\n", Thread.currentThread().getId());
	}

	@Entao("os dados são processados temporariamente para {int}")
	public void os_dados_são_processados_temporariamente(int step) throws InterruptedException {
		Thread.sleep(SLEEP);
		System.out.format("f1 c3 - cenário: "+step+" - Thread ID: %2d\n", Thread.currentThread().getId());
	}
}
