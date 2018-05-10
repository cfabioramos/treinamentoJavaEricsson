package com.br.livrariaEricsson.model;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.br.livrariaEricsson.util.Categoria;

public class Publicacao {

	private String isbn;
	private String nome;
	private Integer anoPublicacao;
	private String nomeEditora;
	private Categoria categoria;
	private Set<Autor> autores;
	
	Publicacao(String isbn, String nome, 
			Integer ano, String editora, 
			Categoria categoria, 
			LinkedHashSet<Autor> autores) 
	{
		this.isbn = isbn;
		this.nome = nome;
		this.anoPublicacao = ano;
		this.nomeEditora = editora;
		this.categoria = categoria;
		this.autores = autores;
	}
	
	public Set<Autor> getAutores() {
		return autores;
	}
	
	public Set<Autor> getAutoresOrdenadosPorNome() {
		TreeSet<Autor> autoresOrdenados = new TreeSet<>(
				(a1, a2) ->  a1.getNome().compareTo(a2.getNome()));
		autoresOrdenados.addAll(this.autores);
		return autoresOrdenados;
	}
	
	public Set<Autor> getAutoresOrdenadosPorDataNascimento() {
		TreeSet<Autor> autoresOrdenados = new TreeSet<>(
				(a1, a2) -> a1.getDataNascimento().compareTo(a2.getDataNascimento()));
		autoresOrdenados.addAll(this.autores);
		return autoresOrdenados;
	}
	
	public Set<Autor> getAutoresOrdenadosPorNomeEDataNascimento() {
		TreeSet<Autor> autoresOrdenados = new TreeSet<>(
				(a1, a2) -> {
					int retorno = a1.getNome().compareTo(a2.getNome());
					if (retorno == 0) {
						return a1.getDataNascimento().compareTo(a2.getDataNascimento()); 
					}
					return retorno;
				});
		autoresOrdenados.addAll(this.autores);
		return autoresOrdenados;
	}

	@Override
	public String toString() {
		return "Publicacao [isbn=" + isbn + ", nome=" + nome + ", anoPublicacao=" + anoPublicacao + ", nomeEditora="
				+ nomeEditora + ", categoria=" + categoria + ", autores=" + autores + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
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
		Publicacao other = (Publicacao) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
	
	
}
