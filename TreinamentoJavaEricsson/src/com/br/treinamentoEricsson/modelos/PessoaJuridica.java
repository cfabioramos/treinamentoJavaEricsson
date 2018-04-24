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

	public String retornaIdentificador() {
		return this.cnpj;
	}
	
}
