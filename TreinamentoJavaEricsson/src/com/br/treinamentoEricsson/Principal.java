package com.br.treinamentoEricsson;

import com.br.treinamentoEricsson.modelos.ContaCorrente;

public class Principal extends Object {
	
	public static void main(String[] args) {
		
		Object cc = new ContaCorrente("2882", "5224", 50.0);
		
		System.out.println("Funcionou.");
	}
}
