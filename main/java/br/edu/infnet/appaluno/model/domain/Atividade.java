package br.edu.infnet.appaluno.model.domain;

import java.time.LocalDateTime;

public class Atividade extends Avaliacao {

	private String descricao;
	private String tipo;
	//private boolean emGrupo;
	
	public Atividade() {
		super();
	}
	
	public Atividade(String disciplina, int pontos) {
		super(disciplina, pontos);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());//getPontos()
		sb.append(";");
		sb.append(this.descricao);
		sb.append(";");
		sb.append(this.tipo);
		sb.append(";");
		sb.append(this.CalcularPontos()); //método abstrato
	
		return sb.toString();
	}
	
	@Override
	public float CalcularPontos() {
		int pontos = (int) getPontos();
		if (tipo.equalsIgnoreCase("Desafio")) {
			pontos += getPontos() + 1;
		}
		if (tipo.equalsIgnoreCase("licao")) {
			pontos += getPontos() +1;
		}
		return pontos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

//	public boolean isEmGrupo() {
//		return emGrupo;
//	}
//
//	public void setEmGrupo(boolean emGrupo) {
//		this.emGrupo = emGrupo;
//	}

}
