package com.br.treinamentoEricsson.modelos;

public class ContaCorrente {
	
	private String agencia;
	private String numero;
	private double valor;
	
	private static int VALOR_INICIAL = 100;
	
	public ContaCorrente(String agencia, String numero, double valor) {
//		super();
		this.agencia = agencia;
		this.numero = numero;
		
		if (valor < ContaCorrente.VALOR_INICIAL) {
			throw new RuntimeException(
					" Uma conta corrente não pode ser "
					+ " aberta com um valor menor que R$ " + ContaCorrente.VALOR_INICIAL);
		}
		
		this.valor = valor;
	}

}
