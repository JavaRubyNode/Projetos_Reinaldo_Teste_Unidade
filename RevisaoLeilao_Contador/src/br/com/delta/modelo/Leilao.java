package br.com.delta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Leilao {

	private Produto produto;
	private List<Lance> listaLance;	
	
	public Leilao(Produto produto) {		
		this.produto = produto;
		this.listaLance = new ArrayList<Lance>();
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public List<Lance> getListaLance() {
		return listaLance;
	}
	public void setListaLance(List<Lance> listaLance) {
		this.listaLance = listaLance;
	}
	public void incluirLance(Lance lance) {
		// Se lance < 5 PODE INCLUIR LANCE
		if (verificarLimiteDeLance(lance)) {
			getListaLance().add(lance);
			lance.getCliente().setContador(lance.getCliente().getContador() + 1);			
		}
	}
	public boolean verificarLimiteDeLance(Lance lance) {
		return (lance.getCliente().getContador() < 5);
	}
	public double maiorLance() {
		double valorRetorno = Double.NEGATIVE_INFINITY;		
		for (Lance lance : getListaLance()) {
			if (lance.getValorLance() > valorRetorno) {
				valorRetorno = lance.getValorLance();
			}
		}		
		return valorRetorno;
	}
	public double menorLance() {
		double valorRetorno = Double.POSITIVE_INFINITY;		
		for (Lance lance : getListaLance()) {
			if (lance.getValorLance() < valorRetorno) {
				valorRetorno = lance.getValorLance();
			}
		}		
		return valorRetorno;
	}
	public double maiorIdadeLance() {
		double valorRetorno = Double.NEGATIVE_INFINITY;		
		for (Lance lance : getListaLance()) {
			if (lance.getCliente().getIdade() > valorRetorno) {
				valorRetorno = lance.getCliente().getIdade();
			}
		}		
		return valorRetorno;
	}	
	public double menorIdadeLance() {
		double valorRetorno = Double.POSITIVE_INFINITY;		
		for (Lance lance : getListaLance()) {
			if (lance.getCliente().getIdade() < valorRetorno) {
				valorRetorno = lance.getCliente().getIdade();
			}
		}		
		return valorRetorno;
	}	
	
}
