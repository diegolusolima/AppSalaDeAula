package br.edu.infnet.appaluno.model.domain;

public class Prova extends Avaliacao {

	private float notaAv1;
	private float notaAv2;
//	private int peso;
	
	public Prova() {
		super();
	}
	
	public Prova(String disciplina, int pontos) {
		super(disciplina, pontos);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.notaAv1);
		sb.append(";");
		sb.append(this.notaAv2);
		sb.append(";");
		sb.append(this.CalcularPontos());
		sb.append(";");
		
		return sb.toString();
	}	
	
//	@Override
//	public float CalcularMedia() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	@Override
	public float CalcularPontos() {
		return (notaAv1 + notaAv2) /2;

	}
	
	public float getNotaAv1() {
		return notaAv1;
	}

	public void setNotaAv1(float notaAv1) {
		this.notaAv1 = notaAv1;
	}

	public float getNotaAv2() {
		return notaAv2;
	}

	public void setNotaAv2(float notaAv2) {
		this.notaAv2 = notaAv2;
	}

//	public int getPeso() {
//		return peso;
//	}
//
//	public void setPeso(int peso) {
//		this.peso = peso;
//	}
	
}
