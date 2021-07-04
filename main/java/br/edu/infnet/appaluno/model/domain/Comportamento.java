package br.edu.infnet.appaluno.model.domain;

public class Comportamento extends Avaliacao {

	private String habilidade;
	private Boolean feedback;
//	private String recompensa;
	
	public Comportamento() {
		super();
	}

	public Comportamento(String disciplina, int pontos) {
		super(disciplina, pontos);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());//getPontos()
		sb.append(";");
		sb.append(this.habilidade);
		sb.append(";");
		sb.append(this.feedback ? "POSITIVO" : "NEGATIVO");
		sb.append(";");
//		sb.append(this.recompensa);
//		sb.append(";");
		sb.append(this.CalcularPontos()); //método abstrato
	
		return sb.toString();
	}
	
	@Override
	public float CalcularPontos() {
		if(feedback == true) {
			if(habilidade.equalsIgnoreCase("Participativo")) {
				pontos += 1;
			} else {
				pontos -= 1;
			}
		}
		return getPontos();
	}

//	public String CalcularRecompensa() {
//	return "TrocarAvatar";
//}
	

	public String getHabilidade() {
		return habilidade;
	}


	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}


	public Boolean getFeedback() {
		return feedback;
	}


	public void setFeedback(Boolean feedback) {
		this.feedback = feedback;
	}
//
//
//	public String getRecompensa() {
//		return recompensa;
//	}
//
//
//	public void setRecompensa(String recompensa) {
//		this.recompensa = recompensa;
//	}
}
