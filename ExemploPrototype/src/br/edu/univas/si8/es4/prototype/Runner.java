package br.edu.univas.si8.es4.prototype;

import java.util.Date;

public class Runner {

	public static void main(String[] args) {
		Contato prototype = new Contato();
		prototype.setNascimento(new Date());
		prototype.setCidade("Pouso Alegre");
		prototype.setEstado("MG");
		
		Contato novo = prototype.clone();
		novo.setCidade("Santa Rita");
		int year = novo.getNascimento().getYear();
		novo.getNascimento().setYear(year - 20);
		
		System.out.println("Protótipo: " + prototype);
		System.out.println("Novo: " + novo);
	}
}
