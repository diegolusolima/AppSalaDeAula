package br.edu.infnet.appaluno.model.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

	public class AppTeste {
	
		public static void main(String[] args) {
			
			try {
				String dir = "c:/dev/";
				String arq = "avaliacao.txt";
				
				try {
					FileWriter fileW = new FileWriter(dir+"out_"+arq);
					BufferedWriter escrita = new BufferedWriter(fileW);
					
					FileReader file = new FileReader(dir+arq);
					BufferedReader leitura = new BufferedReader(file);
					
					String linha = leitura.readLine();
					
					while(linha != null) {
						
						String[] campos = linha.split(";");
	
						switch (campos[0].toUpperCase()) {
						
							case "0":
								System.out.println("Avaliacao/Professor");
								break;
								
							case "A":
								System.out.println("Atividade");
								break;
							
							case "P":
								System.out.println("Prova");
								break;
								
							case "C":
								System.out.println("Comportamento");
								break;
		
							default:
								System.out.println("Entrada Inválida!!!");
								break;	
						}
						
						linha = leitura.readLine();
					}
					
				file.close();
				leitura.close();
				escrita.close();
				fileW.close();
	
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
					
		} finally {
			System.out.println("Processamento finalizado!!!");
		}
	}
}
