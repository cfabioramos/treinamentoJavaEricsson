package com.br.livrariaEricsson.controller;

import java.util.Collection;

import com.br.livrariaEricsson.model.Publicacao;
import com.br.livrariaEricsson.service.LivrariaService;

public class LivrariaController {
	
	private LivrariaService service;
	
	public LivrariaController() {
		this.service = new LivrariaService();
	}

	public Collection<Publicacao> findByFilter(Publicacao publicacao) {
		return this.service.findByFilter(publicacao);
	}
	
}
