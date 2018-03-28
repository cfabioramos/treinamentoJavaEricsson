package com.br.treinamentoEricsson.exceptions;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(double saldo) {
		super("Saldo insuficiente : " + saldo);
	}
	
}
