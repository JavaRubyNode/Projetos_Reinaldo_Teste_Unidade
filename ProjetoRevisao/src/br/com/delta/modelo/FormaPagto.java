package br.com.delta.modelo;

public class FormaPagto {
	private String descricao;
	public FormaPagto(String descricao) {
		super();
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
