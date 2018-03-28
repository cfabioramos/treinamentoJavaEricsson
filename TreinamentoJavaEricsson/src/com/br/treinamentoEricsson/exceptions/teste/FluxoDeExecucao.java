package com.br.treinamentoEricsson.exceptions.teste;

public class FluxoDeExecucao {

	public void metodo1() {
		System.out.println("Inicio do método 1.");
//		this.metodo2();
		System.out.println("Fim do método 1.");
	}

	private void metodo2() {
		System.out.println("Inicio do método 2.");
		this.metodo3();
		System.out.println("Fim do método 2.");
	}

	private void metodo3() throws ArrayIndexOutOfBoundsException {
		System.out.println("Inicio do método 3.");
		
		int[] array = {1, 2, 3};
		
			System.out.println("1o Elemento: " + array[0]);
			System.out.println("4o Elemento: " + array[3]);
		
		System.out.println("Fim do método 3.");
	}

}
