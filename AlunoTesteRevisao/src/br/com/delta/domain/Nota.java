package br.com.delta.domain;

public class Nota {

	private double n1;
	private double n2;
	private Disciplina disciplina;
	private Professor professor;
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Nota() {
		super();
	}
	public Nota(double n1, double n2, Disciplina disciplina, Professor professor) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.disciplina = disciplina;
		this.professor = professor;
	}
	
	
	
}
