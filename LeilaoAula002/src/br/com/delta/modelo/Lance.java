package br.com.delta.modelo;

public class Lance {

	private Cliente cliente;
	private Cliente utimoCliente = new Cliente("wesley", 29);
	private double valorLance;

	public Lance(Cliente cliente, double valorLance) {
		super();
		this.cliente = cliente;
		this.valorLance = valorLance;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		if (clienteIgual()) {
			this.cliente = cliente;
			utimoCliente = cliente;
		} else {
			System.out.println("O mesmo cliente não pode dar larce seguido.");
		}
	}

	public double getValorLance() {
		return valorLance;
	}

	public void setValorLance(double valorLance) {
		if (valorLance()) {
			this.valorLance = valorLance;
		} else {
			System.out.println("Não é permitido valor maior que R$ 1000,00.");
		}
	}

	public boolean valorLance() {
		boolean retorno = false;
		if (this.valorLance <= 1000) {
			retorno = true;
		}
		return retorno;
	}

	public boolean clienteIgual() {
		boolean retorno = false;
		if (!cliente.getNome().equals(utimoCliente.getNome())) {
			retorno = true;
		}
		return retorno;
	}

	public boolean contadorLance() {
		boolean retorno = false;
		if (cliente.getContador() < 5) {
			retorno = true;
			cliente.setContador(cliente.getContador() + 1);
		}
		return retorno;
	}
}
