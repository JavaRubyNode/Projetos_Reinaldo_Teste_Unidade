package br.com.delta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private int id;
	private List<VendaProdutos> listaVendaProdutos;
	private List<VendaFormaPagamento> listaVendaFP;
	
	public Venda(int id) {
		super();		
		this.id = id;
		this.listaVendaProdutos = new ArrayList<VendaProdutos>();
		this.listaVendaFP = new ArrayList<VendaFormaPagamento>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<VendaProdutos> getListaVendaProdutos() {
		return listaVendaProdutos;
	}
	public void setListaVendaProdutos(List<VendaProdutos> listaVendaProdutos) {
		this.listaVendaProdutos = listaVendaProdutos;
	}
	public List<VendaFormaPagamento> getListaVendaFP() {
		return listaVendaFP;
	}
	public void setListaVendaFP(List<VendaFormaPagamento> listaVendaFP) {
		this.listaVendaFP = listaVendaFP;
	}
	public void incluirProduto(Produto produto, int qtde) {
		getListaVendaProdutos().add(new VendaProdutos(qtde, produto));
	}
	public void incluirFP(FormaPagamento fp, double valor) {
		getListaVendaFP().add(new VendaFormaPagamento(valor, fp));
	}	
}
