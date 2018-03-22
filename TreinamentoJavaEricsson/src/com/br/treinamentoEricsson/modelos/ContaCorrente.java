package com.br.treinamentoEricsson.modelos;

public class ContaCorrente extends Object{
	
	private String agencia;
	private String numero;
	private double valor;
	
	public static final int VALOR_INICIAL = 100;
	
	public ContaCorrente(String agencia, String numero, double valor) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		
		if (valor < ContaCorrente.VALOR_INICIAL) {
			throw new RuntimeException(
					" Uma conta corrente não pode ser "
					+ " aberta com um valor menor que R$ " + ContaCorrente.VALOR_INICIAL);
		}
		
		this.valor = valor;
	}
	
	public boolean sacar(double valor) {
		if (this.valor < valor) {
			return false;
		}
		this.valor = this.valor - valor;
		return true;
	}
	
	public void depositar(double valor) {
		this.valor = this.valor + valor;
	}
	
	public boolean transferir (double valor, ContaCorrente destino) {
		if (this.valor < valor) {
			return false;
		}
		
		destino.depositar(valor);
		
		this.valor = this.valor - valor;
		
		return true;
	}
	
	public double obterSaldo() {
		return this.valor;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(this.agencia) * Integer.valueOf(this.numero) ;
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
		return "ContaCorrente [agencia=" + agencia + ", numero=" + numero + ", valor=" + valor + "]";
	}

}
