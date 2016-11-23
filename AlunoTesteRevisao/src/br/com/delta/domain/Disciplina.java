package br.com.delta.domain;

public class Disciplina {

	private String descricao;
	
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Disciplina(String descricao) {
		super();
		this.descricao = descricao;
	}

	public Disciplina() {
		super();
	}
	
}
