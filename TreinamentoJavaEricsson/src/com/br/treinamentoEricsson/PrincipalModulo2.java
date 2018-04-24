package com.br.treinamentoEricsson;

import com.br.treinamentoEricsson.modelos.Banco;
import com.br.treinamentoEricsson.modelos.ContaCorrente;

public class PrincipalModulo2 {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente("2556", "1123 4", 8754.00);
		ContaCorrente c2 = new ContaCorrente("2326", "2234 6", 7653.00);
		ContaCorrente c3 = new ContaCorrente("2442", "1123 8", 1136.00);
		ContaCorrente c4 = new ContaCorrente("3342", "8765 4", 2245.00);
		ContaCorrente c5 = new ContaCorrente("2517", "6546 9", 1231.00);
		
		Banco bancoBrasil = new Banco();
		bancoBrasil.adicionarConta(c1);
		bancoBrasil.adicionarConta(c2);
		bancoBrasil.adicionarConta(c3);
		bancoBrasil.adicionarConta(c4);
		bancoBrasil.adicionarConta(c5);
		
		System.out.println(bancoBrasil.getContasCorrentes().toString());
		
	}
	
}
