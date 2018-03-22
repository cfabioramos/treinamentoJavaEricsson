package com.br.treinamentoEricsson.modelos;

public class PessoaFisica extends Pessoa {

	private String cpf;
	
	public PessoaFisica(String nome, String endereco, String cpf) {
		super(nome, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String retornaIdentificador() {
		return this.cpf;
	}

	@Override
	public void adicionarConta(ContaCorrente conta) {
		//comportamento específico para contas PF
		super.contas.add(conta);
	}
	
}
