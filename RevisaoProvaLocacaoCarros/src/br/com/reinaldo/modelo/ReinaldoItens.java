package br.com.reinaldo.modelo;

public class ReinaldoItens {

	private ReinaldoCarro objCarro;
	private double qtde;
	
	public ReinaldoItens(ReinaldoCarro objCarro, double qtde) {
		super();
		this.objCarro = objCarro;
		this.qtde = qtde;
	}
	public ReinaldoCarro getObjCarro() {
		return objCarro;
	}
	public void setObjCarro(ReinaldoCarro objCarro) {
		this.objCarro = objCarro;
	}
	public double getQtde() {
		return qtde;
	}
	public void setQtde(double qtde) {
		this.qtde = qtde;
	}
}
