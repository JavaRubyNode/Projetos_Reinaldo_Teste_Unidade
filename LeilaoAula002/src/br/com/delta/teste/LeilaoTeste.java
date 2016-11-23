package br.com.delta.teste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.delta.modelo.Cliente;
import br.com.delta.modelo.Lance;
import br.com.delta.modelo.Leilao;
import br.com.delta.modelo.Produto;

public class LeilaoTeste {

	private Leilao leilao;

	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}

	@Before
	public void iniciarCenario() {
		Produto produto1 = new Produto("Gol G4");
		Produto produto2 = new Produto("Punto");
		Cliente cliente1 = new Cliente("ItaloGay", 22);
		Cliente cliente2 = new Cliente("Jose", 24);
		Lance lance1 = new Lance(cliente1, 100);
		Lance lance2 = new Lance(cliente2, 200);
		List<Lance> lances = new ArrayList<Lance>();
		lances.add(lance1);
		lances.add(lance2);
		leilao = new Leilao(produto1, lances);

	}

	@Test
	public void maiorLance() {
		Assert.assertEquals(200, leilao.maiorLance(), 0);

	}

	@Test
	public void menorLance() {
		Assert.assertEquals(100, leilao.menorLance(), 0);

	}

	@Test
	public void maiorIdade() {
		Assert.assertEquals(24, leilao.maiorIdade(), 0);

	}

	@Test
	public void menorIdade() {
		Assert.assertEquals(22, leilao.menorIdade(), 0);

	}

}
