package com.br.treinamentoEricsson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.br.treinamentoEricsson.controller.LoginController;
import com.br.treinamentoEricsson.exceptions.LoginException;
import com.br.treinamentoEricsson.modelos.Gerente;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		
		Gerente vartuli = new Gerente("Vartuli", "Rua Bela Vista", "12345", 
				"vartuli@ericsson.com.br", 12.0, "abc");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Login: ");
		String login = br.readLine();
		System.out.println("Senha: ");
		String senha = br.readLine();
		
		LoginController controller = new LoginController();
		try {
			controller.login(vartuli, login, senha);
			System.out.println("Usuário autenticado com sucesso.");
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
