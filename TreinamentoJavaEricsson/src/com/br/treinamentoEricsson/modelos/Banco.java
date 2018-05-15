package com.br.treinamentoEricsson.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
	
	public Map<String, List<ContaCorrente>> getContasOrganizadasPorAgencia() {
		
		Map<String, List<ContaCorrente>> mapRetorno = new HashMap<>();
		
		for (ContaCorrente contaCorrente : contasCorrentes) {
			
			List<ContaCorrente> contas = 
					mapRetorno.get(contaCorrente.getAgencia());
			
			if (contas == null) {
				List<ContaCorrente> contasRetorno = new ArrayList<>();
				contasRetorno.add(contaCorrente);
				mapRetorno.put(contaCorrente.getAgencia(), contasRetorno);
			}
			else {
				contas.add(contaCorrente);
			}
		}
		
		return mapRetorno;
	}
	
}
