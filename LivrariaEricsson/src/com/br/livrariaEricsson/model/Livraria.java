package com.br.livrariaEricsson.model;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;

import com.br.livrariaEricsson.util.Categoria;

public class Livraria {

	private List<Publicacao> publicacoes;
	private int quantidadeMaximaParaUmaMesmaPublicacao = 5;
	private int quantidadeMinimaParaUmaMesmaPublicacao = 2;
	
	public Boolean adicionar(Publicacao publicacao) {
		int i = 0;
		for (Publicacao livro : publicacoes) {
			if (livro.equals(publicacao))
				i++;
		}
		
		if (i >= this.quantidadeMaximaParaUmaMesmaPublicacao) {
			return false;
		}
		
		this.publicacoes.add(publicacao);
		
		return true;
	}
	
	public Boolean remover(Publicacao publicacao) {
		int i = 0;
		for (Publicacao livro : publicacoes) {
			if (livro.equals(publicacao))
				i++;
		}
		
		if (i <= this.quantidadeMinimaParaUmaMesmaPublicacao) {
			return false;
		}
		
		this.publicacoes.remove(publicacao);
		
		return true;
	}
	
	public Boolean emprestar(Publicacao publicacao) {
		if (this.publicacoes.contains(publicacao)) {
			this.publicacoes.remove(publicacao);
			return true;
		}
		else  {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Autor autor1 = new Autor("Zé", LocalDate.now());
		Autor autor2 = new Autor("Jão", LocalDate.now());
		Autor autor3 = new Autor("Maria", LocalDate.now());
		
		LinkedHashSet<Autor> autores = new LinkedHashSet<>();
		autores.add(autor1);
		autores.add(autor2);
		autores.add(autor3);
		
		Publicacao artigo1 = new Publicacao(
				"12345", "Artigo Collaboration", 
				1999, "Editora Nova",
				Categoria.CIENTIFICO, autores);
		
		System.out.println(artigo1.getAutores());
		
		System.out.println(artigo1.getAutoresOrdenadosPorNome());
	}
	
}
