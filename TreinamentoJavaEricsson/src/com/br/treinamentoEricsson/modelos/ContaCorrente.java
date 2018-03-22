package com.br.treinamentoEricsson.modelos;

public class ContaCorrente extends Object {
	
	private String agencia;
	private String numero;
	private double valor;
	private Pessoa cliente;
	
	public static final int VALOR_INICIAL = 100;
	
	public ContaCorrente(String agencia, String numero, double valor, Pessoa cliente) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
		cliente.adicionarConta(this);
		
		if (valor < ContaCorrente.VALOR_INICIAL) {
			throw new RuntimeException(
					" Uma conta corrente não pode ser "
					+ " aberta com um valor menor que R$ " + ContaCorrente.VALOR_INICIAL);
		}
		
		this.valor = valor;
	}
	
	public boolean sacar(double valor) {
		if (this.temSaldo(valor)) {
			this.valor = this.valor - valor;
			return true;
		}
		return false;
	}
	
	public void depositar(double valor) {
		this.valor = this.valor + valor;
	}
	
	public boolean transferir (double valor, ContaCorrente destino) {
		
		if (this.temSaldo(valor)) {
			destino.depositar(valor);
			
			this.sacar(valor);
			
			return true;
		}
		return false;
	}
	
	public double obterSaldo() {
		return this.valor;
	}
	
	private boolean temSaldo(double valor) {
		if (this.valor < valor) {
			return false;
		}
		return true;
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
