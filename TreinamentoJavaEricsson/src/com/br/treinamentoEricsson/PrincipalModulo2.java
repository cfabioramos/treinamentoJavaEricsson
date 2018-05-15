package com.br.treinamentoEricsson;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.br.treinamentoEricsson.modelos.Banco;
import com.br.treinamentoEricsson.modelos.ContaCorrente;

public class PrincipalModulo2 {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente("2556", "1123 4", 8754.00);
		ContaCorrente c11 = new ContaCorrente("2556", "3345 4", 8554.00);
		ContaCorrente c12 = new ContaCorrente("2556", "9987 5", 3213.00);
		ContaCorrente c2 = new ContaCorrente("2326", "2234 6", 7653.00);
		ContaCorrente c3 = new ContaCorrente("2442", "1123 8", 1136.00);
		ContaCorrente c31 = new ContaCorrente("2442", "1200 9", 1020.00);
		ContaCorrente c4 = new ContaCorrente("3342", "8765 4", 2245.00);
		ContaCorrente c5 = new ContaCorrente("2517", "6546 9", 1231.00);
		ContaCorrente c51 = new ContaCorrente("2517", "3321 1", 1988.00);
		
		Banco bancoBrasil = new Banco();
		bancoBrasil.adicionarConta(c1);
		bancoBrasil.adicionarConta(c11);
		bancoBrasil.adicionarConta(c12);
		bancoBrasil.adicionarConta(c2);
		bancoBrasil.adicionarConta(c3);
		bancoBrasil.adicionarConta(c31);
		bancoBrasil.adicionarConta(c4);
		bancoBrasil.adicionarConta(c5);
		bancoBrasil.adicionarConta(c51);
		
		Map<String, List<ContaCorrente>> contasCorrentes = 
				bancoBrasil.getContasOrganizadasPorAgencia();
		
		Set<Entry<String, List<ContaCorrente>>> conjunto = contasCorrentes.entrySet();
		
		for (Entry<String, List<ContaCorrente>> entry : conjunto) {
			System.out.println(entry);
		}
		
	}
	
}
