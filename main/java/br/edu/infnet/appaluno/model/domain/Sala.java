package br.edu.infnet.appaluno.model.domain;

public class Sala {

	private int numSala;
	private int qtdeAl;
	private float pontSala;
	
	public Sala() {
		super();
	}
	public Sala(int numSala, int qtdeAl) {
		this.numSala = numSala;
		this.qtdeAl = qtdeAl;
	}
	public Sala(int numSala, int qtdeAl, float pontSala) {
		this.numSala = numSala;
		this.qtdeAl = qtdeAl;
		this.pontSala = pontSala;
	}

//	public int CalcularPontoTotal(){
//		return 8;
//	}
	
	@Override
	public String toString() {
		return String.format("%d;%d;",numSala, qtdeAl);//%d, %.2f,qtdeAl, pontSala);
	}
	
	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public int getQtdeAl() {
		return qtdeAl;
	}

	public void setQtdeAl(int qtdeAl) {
		this.qtdeAl = qtdeAl;
	}
//
//	public float getPontSala() {
//		return pontSala;
//	}
//
//	public void setPontSala(float pontSala) {
//		this.pontSala = pontSala;
//	}
	
}
