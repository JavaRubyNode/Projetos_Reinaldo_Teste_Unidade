package br.com.delta.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aluno {

	private int id;
	private String nome;
	private List<Nota> listaNotas;
	
	
	public Aluno(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
		this.listaNotas = new ArrayList<>();
	}


	public int getId() {return id;}

	public void setId(int id) {this.id = id;}

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public List<Nota> getListaNotas() {return listaNotas;}

	public void setListaNotas(List<Nota> listaNotas) {this.listaNotas = listaNotas;}

	public Aluno() {super();}
	
	
	public void addList(Nota ...notas){setListaNotas(Arrays.asList(notas));}
	
	public double maiorNotaN1(){
		double maiorNota = Double.NEGATIVE_INFINITY;
		for (Nota nota : getListaNotas()) {if(nota.getN1()>maiorNota){maiorNota = nota.getN1();}}
		return maiorNota;
	}
	
	public double menorNotaN1(){
		double menorNota = Double.POSITIVE_INFINITY;
		for (Nota nota : getListaNotas()) {if(nota.getN1()<menorNota){menorNota = nota.getN1();}}
		return menorNota;
	}
	
	public double menorNotaN2(){
		double menorNota = Double.POSITIVE_INFINITY;
		for (Nota nota : getListaNotas()) {if(nota.getN2()<menorNota){menorNota = nota.getN2();}}
		return menorNota;
	}
	
	public double maiorNotaN2(){
		double maiorNota = Double.NEGATIVE_INFINITY;
		for (Nota nota : getListaNotas()) {if(nota.getN2()>maiorNota){maiorNota = nota.getN2();}}
		return maiorNota;
	}
	
	public double menorNotaN1Peso(){
		double menorNota = Double.POSITIVE_INFINITY;
		for (Nota nota : getListaNotas()) {if(nota.getN1()*0.4<menorNota){menorNota = nota.getN1()*0.4;}}
		return menorNota;
	}
	
	public double maiorNotaN1Peso(){
		double maiorNota = Double.NEGATIVE_INFINITY;
		for (Nota nota : getListaNotas()) {if(nota.getN1()*0.4>maiorNota){maiorNota = nota.getN1()*0.4;}}
		return maiorNota;
	}
	
	public double menorNotaN2Peso(){
		double menorNota = Double.POSITIVE_INFINITY;
		for (Nota nota : getListaNotas()) {if(nota.getN2()*0.6<menorNota){menorNota = nota.getN2()*0.6;}}
		return menorNota;
	}
	
	public double maiorNotaN2Peso(){
		double maiorNota = Double.NEGATIVE_INFINITY;
		for (Nota nota : getListaNotas()) {if(nota.getN2()*0.6>maiorNota){maiorNota = nota.getN2()*0.6;}}
		return maiorNota;
	}
	

	public double contadorAprovacoes(){
		double cont=0.0;
		double media =0.0;
		
		for (Nota nota : getListaNotas()) {
			media = nota.getN1()*0.4 + nota.getN2()*0.6;
			if(media>=7){
				cont++;
			}
		}
		return cont;
	}
	
	public double contadorN3(){
		double cont=0.0;
		double media =0.0;
		
		for (Nota nota : getListaNotas()) {
			media = nota.getN1()*0.4 + nota.getN2()*0.6;
			if(media<=7){
				cont++;
			}
		}
		return cont;
	}
		
	
}
