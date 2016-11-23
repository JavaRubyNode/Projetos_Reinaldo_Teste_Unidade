package br.com.delta.modelo;

public class Cliente {

	private String nome;
	private int idade;	
	private int contador;
	
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.contador = 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}	
}
