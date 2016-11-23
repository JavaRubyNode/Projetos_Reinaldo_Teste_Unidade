package br.com.delta.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.delta.modelo.ConversorMoeda;

public class ConversorModedaTeste {
	private ConversorMoeda conversor;
	
	@Before
	public void iniciarCenario() {
		this.conversor = new ConversorMoeda(2.5);
	}
	
	@Test
	public void testConversao() {
		Assert.assertEquals(25, this.conversor.converterValor(10), 0);
	}

}
