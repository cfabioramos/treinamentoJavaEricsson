package com.br.livrariaEricsson.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Autor implements Comparable<Autor> {

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

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", dataNascimento=" + dataNascimento + ", publicacoes=" + publicacoes + "]";
	}

	@Override
	public int compareTo(Autor outroAutor) {
		return this.nome.compareTo(outroAutor.getNome());
	}
	
}
