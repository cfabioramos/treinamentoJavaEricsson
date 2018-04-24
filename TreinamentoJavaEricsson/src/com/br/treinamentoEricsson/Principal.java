package com.br.treinamentoEricsson;

import java.io.IOException;

import com.br.treinamentoEricsson.modelos.Cliente;
import com.br.treinamentoEricsson.modelos.ContaCorrente;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		
		Cliente cliente1 = new Cliente("Paulo Roberto", "Alameda Martins, 308", new ContaCorrente("2882", "5224", 10000.00));
		
		ContaCorrente c1 = new ContaCorrente("2556", "3321 4", 2000.00);
		
		cliente1.adicionarConta(c1);
		
		cliente1.getContas().add(new ContaCorrente("2556", "3321 4", 2000.00));
		
//		System.out.println(cliente1.getContas().size());
//			
//		cliente1.removerConta(c1);
//		
//		System.out.println(cliente1.getContas().size());
	}
}
