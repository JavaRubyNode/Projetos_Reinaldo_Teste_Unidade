package br.com.delta.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.delta.modelo.Cliente;
import br.com.delta.modelo.Lance;

public class LanceTeste {

	private Lance lance;

	@Before
	public void iniciarCenario() {
		this.lance = new Lance(new Cliente("wesley", 29), 1000);
	}

	@Test
	public void valorLance() {
		Assert.assertEquals(true, lance.valorLance());
	}

	@Test
	public void utimoCliente() {
		Assert.assertEquals(false, lance.clienteIgual());
	}

	@Test
	public void quantidadeLance() {
		Assert.assertEquals(true, lance.contadorLance());
	}
}
