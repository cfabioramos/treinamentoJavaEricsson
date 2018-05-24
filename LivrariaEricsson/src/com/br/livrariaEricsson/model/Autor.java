package com.br.livrariaEricsson.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Autor extends Object{

	private String nome;
	private LocalDate dataNascimento;
	private List<Publicacao> publicacoes;
	
	public Autor(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		publicacoes = new ArrayList<>();
	}
	
	public Publicacao publicar(Publicacao publicacao) {
		// poderia ir no banco de dados persistir a informação
		//publicacao.setId(12312);
		this.publicacoes.add(publicacao);
		//retorna a publicacao enriquecida
		return publicacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", dataNascimento=" + dataNascimento + ", publicacoes=" + publicacoes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
