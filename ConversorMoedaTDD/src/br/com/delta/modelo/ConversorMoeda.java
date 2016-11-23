package br.com.delta.modelo;

public class ConversorMoeda {
	private double valorDeConversao;
	
	public ConversorMoeda(double valorDeConversao) {
		this.valorDeConversao = valorDeConversao;
	}

	public double converterValor(double valor) {
		return (valor * this.valorDeConversao);
	}

	

}
