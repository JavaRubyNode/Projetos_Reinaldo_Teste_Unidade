package br.com.delta.modelo;

public class Associado {

	private String nome;
	private String codCarteira;	
	public Associado(String nome, String codCarteira) {
		super();
		this.nome = nome;
		this.codCarteira = codCarteira;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodCarteira() {
		return codCarteira;
	}
	public void setCodCarteira(String codCarteira) {
		this.codCarteira = codCarteira;
	}
	
}
