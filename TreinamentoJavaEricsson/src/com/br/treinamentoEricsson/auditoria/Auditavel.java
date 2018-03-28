package com.br.treinamentoEricsson.auditoria;

public interface Auditavel {

	public default void realizarAuditoria() {
		System.out.println("Implementacao comum de auditoria...");
	}
}
