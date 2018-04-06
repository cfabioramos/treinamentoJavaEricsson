package com.br.treinamentoEricsson.exceptions;

public class LoginException extends RuntimeException {

	public LoginException() {
		super("Usuário ou senha inválido");
	}
	
}
