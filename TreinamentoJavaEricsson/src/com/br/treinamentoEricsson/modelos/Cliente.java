package com.br.treinamentoEricsson.modelos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Cliente extends Pessoa {
	
	private Collection<ContaCorrente> contas;
	
	public Cliente(String nome, String endereco, ContaCorrente conta) {
		super(nome, endereco);
		contas = new ArrayList<>();
		contas.add(conta);
	}

	public void adicionarConta(ContaCorrente conta) {
		//TODO notificar outros serviços... 
		this.contas.add(conta);
	}
	
	public void removerConta(ContaCorrente conta) {
		//TODO notificar outros serviços...
		this.contas.remove(conta);
	}

	public String retornaIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Collection<ContaCorrente> getContas() {
		return Collections.unmodifiableCollection(contas);
	}

}
