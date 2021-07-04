package br.edu.infnet.appaluno.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Avaliacao {

	protected String disciplina;
	protected int pontos;
	protected LocalDateTime data;

	public Avaliacao() {
	this.data = LocalDateTime.now();
	}
	
	public Avaliacao(String disciplina, int pontos){
	this();
	this.disciplina = disciplina;
	this.pontos = pontos;
	}
	
	public abstract float CalcularPontos() ;
	
//	public int CalcularNotas() {
//		return 10
//	}
	
//	public int CalcularPontos() {
//	 return 3
//}
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.disciplina);
		sb.append(";");
		sb.append(this.pontos);
		sb.append(";");
		sb.append(this.data.format(formato));
		
		return sb.toString();
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public float getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public LocalDateTime getData() {
		return data;
	}
}
