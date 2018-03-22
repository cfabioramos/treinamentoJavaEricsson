package com.br.treinamentoEricsson;

import com.br.treinamentoEricsson.modelos.ContaCorrente;

public class Principal extends Object {
	
	public static void main(String[] args) {
		ContaCorrente ccMiguel = new ContaCorrente("2882", "5224", 100.0);
		ContaCorrente ccVini = new ContaCorrente("2882", "5224", 10000.0);
		ccVini.depositar(50.0);
		
		ContaCorrente cc = ccMiguel;
		
		System.out.println(ccMiguel);
		
		System.out.println(cc);
		
		System.out.println(ccMiguel.equals(ccVini));
	}
}
