package br.com.delta.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.delta.modelo.ECF;
import br.com.delta.modelo.FormaPagamento;
import br.com.delta.modelo.Produto;
import br.com.delta.modelo.Venda;

public class TesteImpressoraECF {

	private Venda venda;
	private ECF ecf;
	
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public ECF getEcf() {
		return ecf;
	}

	public void setEcf(ECF ecf) {
		this.ecf = ecf;
	}

	@Before
	public void iniciarCenario() {
		Venda venda = new Venda(10);
		venda.incluirProduto(new Produto(1, "Arroz", 13), 1);
		venda.incluirProduto(new Produto(2, "Feijão", 10), 2);
		venda.incluirFP(new FormaPagamento(1, "Dinheiro"), 10);
		venda.incluirFP(new FormaPagamento(2, "Cartão"), 23);
		setVenda(venda);
//		setEcf(new ECF());
		setEcf(Mockito.mock(ECF.class));		
		Mockito.when(getEcf().abrirCupom("DELTA")).thenReturn(1);
		Mockito.when(getEcf().venderItem(getVenda().getListaVendaProdutos())).thenReturn(1);
		Mockito.when(getEcf().incluirFP(getVenda().getListaVendaFP())).thenReturn(1);
		Mockito.when(getEcf().fecharCupom("OBRIGADO :-)")).thenReturn(1);		
	}
		
	@Test
	public void abrirCupom() {
		Assert.assertEquals(1, getEcf().abrirCupom("DELTA"), 0);
	}

	@Test
	public void venderItem() {
		Assert.assertEquals(1, getEcf().venderItem(getVenda().getListaVendaProdutos()), 0);
	}

	@Test
	public void incluirFP() {
		Assert.assertEquals(1, getEcf().incluirFP(getVenda().getListaVendaFP()), 0);
	}

	@Test
	public void fecharCupom() {
		Assert.assertEquals(1, getEcf().fecharCupom("OBRIGADO :-)"), 0);
	}
	
}
