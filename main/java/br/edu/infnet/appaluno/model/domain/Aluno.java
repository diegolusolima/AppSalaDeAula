package br.edu.infnet.appaluno.model.domain;

public class Aluno {
	private String nome;
	private String turma;
	private int senha;

	public Aluno() {
		super();
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(String nome, String turma) { //int senha) {
		this.nome = nome;
		this.turma = turma;
//		this.senha = senha;
	}
	
	@Override
	public String toString() {

		return String.format("%s;%s;", nome, turma);//%d,int
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		senha = senha;
	}
}
