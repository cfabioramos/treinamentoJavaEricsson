package com.br.treinamentoEricsson.modelos;

import com.br.treinamentoEricsson.auditoria.Auditavel;

public class PessoaJuridica extends Pessoa implements Auditavel{

	private String cnpj;
	
	public PessoaJuridica(String nome, String endereco, String cnpj) {
		super(nome, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String retornaIdentificador() {
		return this.cnpj;
	}
	
	@Override
	protected void notificarAlteracao() {
		System.out.println("Faz a notificação da pessoa juridica...");
	}

	@Override
	public void adicionarConta(ContaCorrente conta) {
		// TODO Auto-generated method stub
		
	}
	
}
