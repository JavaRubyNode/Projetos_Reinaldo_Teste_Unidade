package br.com.reinaldo.modelo;

public class ReinaldoFormaPagamento {

	private int id;
	private String descricao;
	public ReinaldoFormaPagamento(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
