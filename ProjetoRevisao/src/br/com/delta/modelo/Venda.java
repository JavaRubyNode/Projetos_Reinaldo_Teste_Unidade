package br.com.delta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private Cliente cliente;
	private List<VendaItens> vendaItens;
	private List<VendaFormaPagto> vendaFp;	
	public Venda(Cliente cliente) {
		super();
		this.cliente = cliente;
		this.vendaItens = new ArrayList<VendaItens>();
		this.vendaFp = new ArrayList<VendaFormaPagto>();
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	public List<VendaItens> getVendaItens() {
		return vendaItens;
	}
	public void setVendaItens(List<VendaItens> vendaItens) {
		this.vendaItens = vendaItens;
	}
	public List<VendaFormaPagto> getVendaFp() {
		return vendaFp;
	}
	public void setVendaFp(List<VendaFormaPagto> vendaFp) {
		this.vendaFp = vendaFp;
	}
	public void incluirFP(double valor, FormaPagto formapg) {
		getVendaFp().add(new VendaFormaPagto(valor, formapg));
	}
	public void incluirItens(double qtde, Produto produto) {
		getVendaItens().add(new VendaItens(qtde, produto));
	}

	public double testarValorTotalListaItens() {
		double valorTotalListaItens = 0;		
		for (VendaItens vendaItens : getVendaItens()) {
			valorTotalListaItens += vendaItens.getQtde() * 
					vendaItens.getProduto().getPreco();
		}
		return valorTotalListaItens;
	}
	public double testarQuantidadeTotalProdutos() {
		double qtdeTotalProdutos = 0;		
		for (VendaItens vendaItens : getVendaItens()) {
			qtdeTotalProdutos += vendaItens.getQtde();
		}
		return qtdeTotalProdutos;
	}
	public double testarMaiorValorProduto() {
		double maiorValorProduto = Double.NEGATIVE_INFINITY;		
		for (VendaItens vendaItens : getVendaItens()) {
			if (vendaItens.getProduto().getPreco() > 
					maiorValorProduto) {
				maiorValorProduto = 
						vendaItens.getProduto().getPreco();
			}
		}
		return maiorValorProduto;
	}
	public double testarMaiorValorFP() {
		double maiorValorFP = Double.NEGATIVE_INFINITY;		
		for (VendaFormaPagto vendaFP : getVendaFp()) {
			if (vendaFP.getValor() > maiorValorFP) {
				maiorValorFP = vendaFP.getValor();
			}
		}
		return maiorValorFP;
	}	
}
