package com.br.treinamentoEricsson;

import com.br.treinamentoEricsson.auditoria.Auditoria;
import com.br.treinamentoEricsson.exceptions.SaldoInsuficienteException;
import com.br.treinamentoEricsson.modelos.ContaCorrente;
import com.br.treinamentoEricsson.modelos.PessoaJuridica;

public class Principal extends Object {
	
	public static void main(String[] args) {
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Ericsson LTDA", "Rua Nova, 222", "998997686");
		
		ContaCorrente ccPessoaFisica1 = 
				new ContaCorrente("2882", "5224", 10000.0, pessoaJuridica);
		
		try {
			ccPessoaFisica1.sacar(13599);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}
}
