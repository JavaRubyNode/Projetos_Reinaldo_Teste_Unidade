package br.com.reinaldo.modelo;

public class ReinaldoItensFormaPagamento {

	private double valor;
	private ReinaldoFormaPagamento objFP;
	public ReinaldoItensFormaPagamento(double valor,
			ReinaldoFormaPagamento objFP) {
		super();
		this.valor = valor;
		this.objFP = objFP;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public ReinaldoFormaPagamento getObjFP() {
		return objFP;
	}
	public void setObjFP(ReinaldoFormaPagamento objFP) {
		this.objFP = objFP;
	}
	
	
	
}
