package com.br.treinamentoEricsson.modelos;

import com.br.treinamentoEricsson.auditoria.Auditavel;
import com.br.treinamentoEricsson.exceptions.SaldoInsuficienteException;

public class ContaCorrente implements Auditavel {

	private String agencia;
	private String numero;
	private double valor;
	private Pessoa cliente;

	public static final double VALOR_INICIAL = 100.0;

	public ContaCorrente(String agencia, String numero, double valor) {
		super();
		this.agencia = agencia;
		this.numero = numero;

		if (valor < ContaCorrente.VALOR_INICIAL) {
			throw new RuntimeException(
					"O valor inicial para abertura "
					+ " de conta não pode ser menor que " 
							+ ContaCorrente.VALOR_INICIAL);
		}

		this.valor = valor;
	}

	public boolean sacar(double valor) throws SaldoInsuficienteException {
		this.temSaldo(valor);
		this.valor = this.valor - valor;
		return true;
	}

	public void depositar(double valor) {
		this.valor = this.valor + valor;
	}

	public boolean transferir(double valor, ContaCorrente destino) throws SaldoInsuficienteException {
		this.temSaldo(valor);
		destino.depositar(valor);
		this.sacar(valor);
		return true;
	}

	public double obterSaldo() {
		return this.valor;
	}

	private void temSaldo(double valor) throws SaldoInsuficienteException {
		if (this.valor < valor)
			throw new SaldoInsuficienteException(this.valor);
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		ContaCorrente other = (ContaCorrente) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContaCorrente [agencia=" + agencia + ", numero=" + numero + "]";
	}

}
