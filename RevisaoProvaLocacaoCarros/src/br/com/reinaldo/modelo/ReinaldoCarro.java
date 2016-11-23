package br.com.reinaldo.modelo;

public class ReinaldoCarro {

	private int id;
	private String modelo;
	private String fabricante;
	private double preco;
	public ReinaldoCarro(int id, String modelo, String fabricante, double preco) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}	
}
