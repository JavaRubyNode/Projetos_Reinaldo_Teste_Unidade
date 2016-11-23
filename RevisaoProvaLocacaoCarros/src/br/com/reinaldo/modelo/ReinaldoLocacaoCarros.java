package br.com.reinaldo.modelo;

import java.util.ArrayList;
import java.util.List;

public class ReinaldoLocacaoCarros {

	private int id;
	private double valorJuro;
	private double valorDesconto;
	private ReinaldoCliente objCliente;
	private List<ReinaldoItens> listaItens;
	private List<ReinaldoItensFormaPagamento> listaItensFP;

	public ReinaldoLocacaoCarros(int id, double valorJuro,
			double valorDesconto, ReinaldoCliente objCliente) {
		super();
		this.id = id;
		this.valorJuro = valorJuro;
		this.valorDesconto = valorDesconto;
		this.objCliente = objCliente;
		this.listaItens = new ArrayList<ReinaldoItens>();
		this.listaItensFP = new ArrayList<ReinaldoItensFormaPagamento>();
	}
	
	public void incluirCarro(double qtde, ReinaldoCarro objCarro) {
		getListaItens().add(new ReinaldoItens(objCarro, qtde));		
	}
	public void incluidFP(double valor, ReinaldoFormaPagamento objFP) {
		getListaItensFP().add(new ReinaldoItensFormaPagamento(valor, objFP));
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorJuro() {
		return valorJuro;
	}
	public void setValorJuro(double valorJuro) {
		this.valorJuro = valorJuro;
	}
	public double getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public ReinaldoCliente getObjCliente() {
		return objCliente;
	}
	public void setObjCliente(ReinaldoCliente objCliente) {
		this.objCliente = objCliente;
	}
	public List<ReinaldoItens> getListaItens() {
		return listaItens;
	}
	public void setListaItens(List<ReinaldoItens> listaItens) {
		this.listaItens = listaItens;
	}
	public List<ReinaldoItensFormaPagamento> getListaItensFP() {
		return listaItensFP;
	}
	public void setListaItensFP(List<ReinaldoItensFormaPagamento> listaItensFP) {
		this.listaItensFP = listaItensFP;
	}
	public double testeQuantidadeTotalCarros() {
		double qtde = 0;		
		for (ReinaldoItens reinaldoItens : getListaItens()) {
			qtde += reinaldoItens.getQtde();
		}
		return qtde;
	}
	public double testeMaiorValorFP() {
		double valorMaiorFP = Double.NEGATIVE_INFINITY;		
		for (ReinaldoItensFormaPagamento reinaldoItensFP : getListaItensFP()) {
			if (reinaldoItensFP.getValor() > valorMaiorFP) {
				valorMaiorFP = reinaldoItensFP.getValor();
			}			
		}
		return valorMaiorFP;
	}
	public double testeMenorValorFP() {
		double valorMenorFP = Double.POSITIVE_INFINITY;		
		for (ReinaldoItensFormaPagamento reinaldoItensFP : getListaItensFP()) {
			if (reinaldoItensFP.getValor() < valorMenorFP) {
				valorMenorFP = reinaldoItensFP.getValor();
			}			
		}
		return valorMenorFP;
	}
	public double testeValorTotalLocacaoJuroDesconto() {
		double valorTotalFP = 0;		
		for (ReinaldoItensFormaPagamento reinaldoItensFP : getListaItensFP()) {
			valorTotalFP += reinaldoItensFP.getValor();
		}
		return valorTotalFP;
	}	
	
	
}
