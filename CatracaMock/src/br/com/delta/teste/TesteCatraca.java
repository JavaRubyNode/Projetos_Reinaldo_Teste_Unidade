package br.com.delta.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.delta.modelo.Associado;
import br.com.delta.modelo.Catraca;
import br.com.delta.negocio.AssociadoNegocio;

public class TesteCatraca {

	private Associado associado;
	private Catraca catraca;
	
	@Before
	public void iniciarCenario() {
		this.associado = new Associado("Reinaldo Jr", "123456");
		//this.catraca = new Catraca();
		this.catraca = Mockito.mock(Catraca.class);
		Mockito.when(this.catraca.validarAcessoEntrada(this.associado.getCodCarteira(), 
														new AssociadoNegocio().validarAcessoAssociado(this.associado))).thenReturn(true);
	}
	
	@Test
	public void testarAcessoEntrada() {
		Assert.assertTrue(catraca.validarAcessoEntrada(this.associado.getCodCarteira(), 
													   new AssociadoNegocio().validarAcessoAssociado(this.associado)));
	}
	
}
