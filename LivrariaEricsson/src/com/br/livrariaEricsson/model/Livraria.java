package com.br.livrariaEricsson.model;

import java.util.List;

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
	
}
