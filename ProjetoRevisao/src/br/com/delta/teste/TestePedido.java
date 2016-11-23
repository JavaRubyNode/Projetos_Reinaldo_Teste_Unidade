package br.com.delta.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.delta.modelo.Cliente;
import br.com.delta.modelo.EmissorEtiquetaZebra;
import br.com.delta.modelo.FormaPagto;
import br.com.delta.modelo.Produto;
import br.com.delta.modelo.Venda;

public class TestePedido {

	private Venda venda;
	private EmissorEtiquetaZebra emissorEtiqueta;
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public EmissorEtiquetaZebra getEmissorEtiqueta() {
		return emissorEtiqueta;
	}
	public void setEmissorEtiqueta(EmissorEtiquetaZebra emissorEtiqueta) {
		this.emissorEtiqueta = emissorEtiqueta;
	}

	@Before
	public void iniciarCenario() {
		setVenda(new Venda(new Cliente("Reinaldo Jr")));
		getVenda().incluirItens(1, new Produto("Teclado", 100));
		getVenda().incluirItens(1, new Produto("Impressora Epson", 300));
		
		getVenda().incluirFP(100, new FormaPagto("DINHEIRO"));
		getVenda().incluirFP(300, new FormaPagto("CARTÃO"));
		
		setEmissorEtiqueta(Mockito.mock(EmissorEtiquetaZebra.class));				
	}
	
	
	@Test
	public void testarValorTotalListaItens() {
		Assert.assertEquals(400, 
	getVenda().testarValorTotalListaItens(), 0.0);
	}
	
	@Test
	public void testarQuantidadeTotalProdutos() {
		Assert.assertEquals(2, 
    getVenda().testarQuantidadeTotalProdutos(), 0.0);
	}
	
	@Test
	public void testarMaiorValorProduto() {
		Assert.assertEquals(300, 
	getVenda().testarMaiorValorProduto(), 0.0);
	}
	
	@Test
	public void testarMaiorFormaPagto() {
		Assert.assertEquals(300, 
				getVenda().testarMaiorValorFP(), 0.0);
	}
	
	@Test
	public void testarEmitirEtiquetaSucesso() {
		Produto produto = new Produto("Teclado", 100);

		Mockito.when(getEmissorEtiqueta().
				emitirEtiqueta(produto)).thenReturn(1);
		Assert.assertEquals(1, getEmissorEtiqueta().
				emitirEtiqueta(produto), 0);
	}
	
	@Test
	public void testarEmitirEtiquetaFalha() {
		Produto produto = new Produto("MOUSE", 50);
		Mockito.when(getEmissorEtiqueta().
				emitirEtiqueta(produto)).thenReturn(2);		
		Assert.assertEquals(2, getEmissorEtiqueta().
				emitirEtiqueta(produto), 0);
	}
	
}
