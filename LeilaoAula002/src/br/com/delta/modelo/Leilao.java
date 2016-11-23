package br.com.delta.modelo;

import java.util.List;

public class Leilao {

	private Produto produto;
	private List<Lance> lances;

	public Leilao(Produto produto, List<Lance> lances) {
		super();
		this.produto = produto;
		this.lances = lances;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Lance> getLances() {
		return lances;
	}

	public void setLances(List<Lance> lances) {
		this.lances = lances;
	}

	public double maiorLance() {
		double maiorLance = 0;
		for (Lance lance : lances) {
			if (maiorLance == 0) {
				maiorLance = lance.getValorLance();
			}
			if (maiorLance < lance.getValorLance()) {
				maiorLance = lance.getValorLance();
			}
		}
		return maiorLance;
	}

	public double menorLance() {
		double menorLance = 0;
		for (Lance lance : lances) {
			if (menorLance == 0) {
				menorLance = lance.getValorLance();
			}
			if (menorLance > lance.getValorLance()) {
				menorLance = lance.getValorLance();
			}
		}
		return menorLance;
	}

	public int maiorIdade() {
		int maiorIdade = 0;
		for (Lance lance : lances) {
			if (maiorIdade == 0) {
				maiorIdade = lance.getCliente().getIdade();
			}
			if (maiorIdade < lance.getCliente().getIdade()) {
				maiorIdade = lance.getCliente().getIdade();
			}
		}
		return maiorIdade;
	}

	public int menorIdade() {
		int menorIdade = 0;
		for (Lance lance : lances) {
			if (menorIdade == 0) {
				menorIdade = lance.getCliente().getIdade();
			}
			if (menorIdade > lance.getCliente().getIdade()) {
				menorIdade = lance.getCliente().getIdade();
			}
		}
		return menorIdade;
	}

}
