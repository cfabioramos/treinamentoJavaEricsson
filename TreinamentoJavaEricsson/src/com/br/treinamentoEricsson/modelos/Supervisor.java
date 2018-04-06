package com.br.treinamentoEricsson.modelos;

public class Supervisor extends Funcionario {

	private double bonus;
	
	public Supervisor(String nome, String endereco, 
			String matricula, String email, 
			double bonus, String senha) 
	{
		super(nome, endereco, matricula, email, senha);
		this.bonus = bonus;
	}

	@Override
	public void adicionarConta(ContaCorrente conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public String retornaIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		return this.getEmail().equals(login) && this.getSenha().equals(senha);
	}

}
