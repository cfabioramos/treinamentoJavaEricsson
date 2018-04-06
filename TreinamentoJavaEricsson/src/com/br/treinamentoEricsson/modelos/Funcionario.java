package com.br.treinamentoEricsson.modelos;

import com.br.treinamentoEricsson.auxiliares.Autenticador;

public abstract class Funcionario extends Pessoa implements Autenticador {
	
	private String matricula;
	private String email;
	private String senha;
	
	public Funcionario(String nome, String endereco, 
			String matricula, String email, String senha) {
		super(nome, endereco);
		this.matricula = matricula;
		this.email = email;
		this.senha = senha;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
