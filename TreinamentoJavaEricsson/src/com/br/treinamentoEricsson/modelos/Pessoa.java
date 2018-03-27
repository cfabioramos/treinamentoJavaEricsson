package com.br.treinamentoEricsson.modelos;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Pessoa 	{

	private String nome;
	private String endereco;
	
	Collection<ContaCorrente> contas;
	
	public Pessoa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		contas = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public abstract void adicionarConta (ContaCorrente conta);
	
	public abstract String retornaIdentificador();
	
	protected void notificarAlteracao() {
		System.out.println("Faz a notificação da superclasse...");
	}
	
	public void removerConta (ContaCorrente contaCorrente) {
		// Valida o saldo;
		notificarAlteracao();
		//TODO método remove.
		this.contas.remove(contaCorrente);
	}
	
}
