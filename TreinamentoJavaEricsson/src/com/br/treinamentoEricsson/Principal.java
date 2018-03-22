package com.br.treinamentoEricsson;

import com.br.treinamentoEricsson.modelos.ContaCorrente;
import com.br.treinamentoEricsson.modelos.Pessoa;
import com.br.treinamentoEricsson.modelos.PessoaFisica;
import com.br.treinamentoEricsson.modelos.PessoaJuridica;

public class Principal extends Object {
	
	public static void main(String[] args) {
		
		Pessoa pessoaFisica1 = new PessoaFisica("João", "Rua Nova, 222", "998997686");
		
		System.out.println("O identificador desta pessoa é: " + pessoaFisica1.retornaIdentificador());
		
		ContaCorrente ccPessoaFisica1 = new ContaCorrente("2882", "5224", 10000.0, pessoaFisica1);
		
		Pessoa pessoaJuridica1 = new PessoaJuridica("Ericsson LTDA", "Rua Velha, 333", "09789879876");
		
		System.out.println("O identificador desta pessoa é: " + pessoaJuridica1.retornaIdentificador());
		
		pessoaFisica1.removerConta(ccPessoaFisica1);
		
		pessoaJuridica1.removerConta(ccPessoaFisica1);

		//		ccMiguel.depositar(700.0);
//		System.out.println(ccMiguel.obterSaldo());
//		
//		ccVini.sacar(75.0);
//		System.out.println(ccVini.obterSaldo());
//		
//		ccVini.transferir(90, ccMiguel);
//		System.out.println(ccMiguel.obterSaldo());
//		System.out.println(ccVini.obterSaldo());
		
	}
}
