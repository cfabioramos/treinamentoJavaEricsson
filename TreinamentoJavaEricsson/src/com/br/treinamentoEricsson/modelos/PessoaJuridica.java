package com.br.treinamentoEricsson.modelos;

public class PessoaJuridica extends Pessoa {

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
	public void adicionarConta(ContaCorrente conta) {
		//comportamento espec�fico para contas PJ
		super.contas.add(conta);
	}
	
	@Override
	protected void notificarAlteracao() {
		System.out.println("Faz a notifica��o da pessoa juridica...");
	}
	
}
