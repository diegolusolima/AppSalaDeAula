package br.edu.infnet.appaluno.model.testes;

import br.edu.infnet.appaluno.model.domain.Atividade;
import br.edu.infnet.appaluno.model.domain.Comportamento;
import br.edu.infnet.appaluno.model.domain.Prova;

public class AvaliacaoTeste {

	public static void main(String[] args) {
		
		Atividade ativ1 = new Atividade("Português", 2);
		ativ1.setTipo("Desafio");
		ativ1.setTipo("licao");
		ativ1.setDescricao("Aula invertida");
		ativ1.CalcularPontos();
		System.out.println("Atividade: " + ativ1);
		
		Prova prov1 = new Prova("História", 7);
		prov1.setNotaAv1(5);
		prov1.setNotaAv2(8);
		System.out.println("Prova: " + prov1);
	
		Comportamento comp1 = new Comportamento("Matemática", 3);
		comp1.setHabilidade("Trabalhou Duro");
		comp1.setFeedback(true);
		System.out.println("Comportamento: " + comp1);
	}
}
