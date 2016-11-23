package br.com.delta.modelo;

public class VendaFormaPagamento {

	private double valor;
	private FormaPagamento fp;
	public VendaFormaPagamento(double valor, FormaPagamento fp) {
		super();
		this.valor = valor;
		this.fp = fp;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public FormaPagamento getFp() {
		return fp;
	}
	public void setFp(FormaPagamento fp) {
		this.fp = fp;
	}
}
