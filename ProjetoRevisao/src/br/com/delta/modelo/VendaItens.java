package br.com.delta.modelo;

public class VendaItens {
	private double qtde;
	private Produto produto;	
	public VendaItens(double qtde, Produto produto) {
		super();
		this.qtde = qtde;
		this.produto = produto;
	}
	public double getQtde() {
		return qtde;
	}
	public void setQtde(double qtde) {
		this.qtde = qtde;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
