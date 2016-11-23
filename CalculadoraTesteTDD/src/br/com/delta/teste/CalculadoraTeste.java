package br.com.delta.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.delta.modelo.Calculadora;

public class CalculadoraTeste {

	private Calculadora calculadora;	
	@Before
	public void iniciarCenario() {
		this.calculadora = new Calculadora(5, 5);
	}	
	@Test
	public void testarSoma() {
		Assert.assertEquals(this.calculadora.somar(), 10, 0);
	}
	@Test
	public void testarSubtrair() {
		Assert.assertEquals(this.calculadora.subtrair(), 0, 0);
	}
}
