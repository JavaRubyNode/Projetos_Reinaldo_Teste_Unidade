package br.com.delta.teste;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.delta.modelo.Cliente;
import br.com.delta.modelo.Lance;
import br.com.delta.modelo.Leilao;
import br.com.delta.modelo.Produto;

public class Avaliador {

	private Leilao leilao;
	
	@Before
	public void iniciarCenario() {
		leilao = new Leilao(new Produto("Bike"));
		leilao.incluirLance(new Lance(new Cliente("Maria", 22)  , 12))   ;
		leilao.incluirLance(new Lance(new Cliente("José", 30)   , 1000)) ; 
		leilao.incluirLance(new Lance(new Cliente("Roberto", 50), 800))  ;
		leilao.incluirLance(new Lance(new Cliente("Carlos", 60) , 10000));
	}
	
	@Test
	public void maiorLance() {
		Assert.assertEquals(10000, 
							this.leilao.maiorLance(), 0);
	}
	@Test
	public void menorLance() {
		Assert.assertEquals(12, 
							this.leilao.menorLance(), 0);
	}
	@Test
	public void maiorIdade() {
		Assert.assertEquals(60, 
							this.leilao.maiorIdadeLance(), 0);
	}		
	@Test
	public void menorIdade() {
		Assert.assertEquals(22, 
							this.leilao.menorIdadeLance(), 0);
	}	
	@Test
	public void testarLimiteLeilao() {
		this.leilao = new Leilao(new Produto("Bike"));
		Cliente clienteMaria = new Cliente("Maria", 20);
		this.leilao.incluirLance(new Lance(clienteMaria, 100));
		this.leilao.incluirLance(new Lance(clienteMaria, 200));
		this.leilao.incluirLance(new Lance(clienteMaria, 300));
		this.leilao.incluirLance(new Lance(clienteMaria, 400));
		this.leilao.incluirLance(new Lance(clienteMaria, 500));			
		Assert.assertFalse(this.leilao.verificarLimiteDeLance(
							new Lance(clienteMaria, 600)));
	}

}
