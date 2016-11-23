package br.com.delta.modelo;

public class Lance {

	private Cliente cliente;
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
		this.cliente = cliente;
	}
	public double getValorLance() {
		return valorLance;
	}
	public void setValorLance(double valorLance) {
		this.valorLance = valorLance;
	}
	
}
