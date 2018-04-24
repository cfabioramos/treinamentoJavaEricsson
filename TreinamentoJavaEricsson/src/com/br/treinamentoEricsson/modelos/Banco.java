package com.br.treinamentoEricsson.modelos;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Banco {

	private Set<ContaCorrente> contasCorrentes;
	
	public Banco() {
		contasCorrentes = new LinkedHashSet<>();
	}
	
	public Set<ContaCorrente> getContasCorrentes() {
		return Collections.unmodifiableSet(contasCorrentes);
	}

	public void adicionarConta(ContaCorrente contaCorrente) {
		this.contasCorrentes.add(contaCorrente);
	}
	
}
