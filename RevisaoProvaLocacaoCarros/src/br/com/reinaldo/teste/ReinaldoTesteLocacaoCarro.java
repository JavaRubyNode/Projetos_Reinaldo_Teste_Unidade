package br.com.reinaldo.teste;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.reinaldo.modelo.ReinaldoCarro;
import br.com.reinaldo.modelo.ReinaldoCliente;
import br.com.reinaldo.modelo.ReinaldoFormaPagamento;
import br.com.reinaldo.modelo.ReinaldoLocacaoCarros;

public class ReinaldoTesteLocacaoCarro {

	private ReinaldoLocacaoCarros objLocacao;
	
	public ReinaldoLocacaoCarros getObjLocacao() {
		return objLocacao;
	}

	public void setObjLocacao(ReinaldoLocacaoCarros objLocacao) {
		this.objLocacao = objLocacao;
	}

	@Before
	public void iniciarCenario() {
	setObjLocacao(
	new ReinaldoLocacaoCarros(1, 0, 50, 
				new ReinaldoCliente(1, "Reinaldo Jr", "999.999.999-99")));
	getObjLocacao().incluirCarro(1, new ReinaldoCarro(1, "Palio", "Fiat", 300));
	getObjLocacao().incluirCarro(2, new ReinaldoCarro(2, "Gol", "WV", 250));
	getObjLocacao().incluidFP(300, new ReinaldoFormaPagamento(1, "Dinheiro"));
	getObjLocacao().incluidFP(450, new ReinaldoFormaPagamento(2, "Cartão"));
	}
	
	@Test
	public void testeQuantidadeTotalCarros() {
		Assert.assertEquals(3, getObjLocacao().testeQuantidadeTotalCarros(), 0);
	}
	@Test
	public void testeMaiorValorFP() {
		Assert.assertEquals(450, getObjLocacao().testeMaiorValorFP(), 0);
	}
	@Test
	public void testeMenorValorFP() {
		getObjLocacao().setListaItensFP(null);
		Assert.assertEquals(300, getObjLocacao().testeMenorValorFP(), 0);
	}
	@Test
	public void testeValorTotalJuroDesconto() {
		Assert.assertEquals(750, getObjLocacao().testeValorTotalLocacaoJuroDesconto(), 0);
	}	
}
