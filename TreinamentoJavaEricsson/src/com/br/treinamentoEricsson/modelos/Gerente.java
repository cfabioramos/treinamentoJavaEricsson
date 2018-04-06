package com.br.treinamentoEricsson.modelos;

public class Gerente extends Funcionario {

	private double bonus;
	
	public Gerente(String nome, String endereco, 
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
		return this.getMatricula().equals(login) && this.getSenha().equals(senha);
	}

}
