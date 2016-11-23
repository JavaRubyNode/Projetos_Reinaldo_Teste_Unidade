package br.com.delta.teste;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.delta.domain.Aluno;
import br.com.delta.domain.Disciplina;
import br.com.delta.domain.Nota;
import br.com.delta.domain.Professor;


public class TesteAluno {

	private Aluno aluno;
		
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	
	@Before
	public void cenario(){
		aluno = new Aluno(1, "Vincius");
		aluno.addList(
				new Nota(5, 6, new Disciplina("matematica"), new Professor("Reinaldo")),
				new Nota(8, 8, new Disciplina("portugues"), new Professor("Rose")),
				new Nota(7, 10, new Disciplina("programacao"), new Professor("Marcos")));
		
		setAluno(aluno);
		}


	@Test
	public void maiorNotaN1() {Assert.assertEquals(8, aluno.maiorNotaN1(), 0);}

	@Test
	public void menorNotaN1(){Assert.assertEquals(5, aluno.menorNotaN1(), 0);}
	
	@Test 
	public void maiorNotaN2(){Assert.assertEquals(10, aluno.maiorNotaN2(), 0);}
	
	@Test
	public void menorNotaN2(){Assert.assertEquals(6, aluno.menorNotaN2(), 0);}
	
	@Test
	public void maiorNotaN1Peso(){Assert.assertEquals(3.2, aluno.maiorNotaN1Peso(), 1);}
	
	@Test
	public void menorNotaN1Peso(){Assert.assertEquals(2.0, aluno.menorNotaN1Peso(), 1);}
	
	@Test
	public void maiorNotaN2Peso(){Assert.assertEquals(6.0, aluno.maiorNotaN2Peso(), 0);}
	
	@Test
	public void menorNotaN2Peso(){Assert.assertEquals(3.599999999, aluno.menorNotaN2Peso(), 0.1);}
	
	@Test
	public void contadorAprovacoes(){Assert.assertEquals(2, aluno.contadorAprovacoes(), 0);}
	
	@Test
	public void contadorN3(){Assert.assertEquals(1, aluno.contadorN3(), 0);}
	
}
