package com.br.treinamentoEricsson.exceptions;

public class LoginException extends RuntimeException {

	public LoginException() {
		super("Usu�rio ou senha inv�lido");
	}
	
}
