package br.com.delta.modelo;

public class VendaProdutos {

	private int qtde;
	private Produto produto;
	public VendaProdutos(int qtde, Produto produto) {
		super();
		this.qtde = qtde;
		this.produto = produto;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
