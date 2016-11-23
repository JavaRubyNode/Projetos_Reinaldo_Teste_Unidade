package br.com.delta.modelo;

public class VendaFormaPagto {
	private double valor;
	private FormaPagto formapg;
	public VendaFormaPagto(double valor, FormaPagto formapg) {
		super();
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public FormaPagto getFormapg() {
		return formapg;
	}
	public void setFormapg(FormaPagto formapg) {
		this.formapg = formapg;
	}	
}
