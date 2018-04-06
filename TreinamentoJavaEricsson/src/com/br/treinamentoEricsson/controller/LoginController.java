package com.br.treinamentoEricsson.controller;

import com.br.treinamentoEricsson.auxiliares.Autenticador;
import com.br.treinamentoEricsson.exceptions.LoginException;

public class LoginController {

	public void login(Autenticador autenticador, 
			String login, String senha) 
	{
		if (!autenticador.autenticar(login, senha)) {
			throw new LoginException();
		}
	}
	
}
