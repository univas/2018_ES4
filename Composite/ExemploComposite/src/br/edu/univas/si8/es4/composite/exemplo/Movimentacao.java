package br.edu.univas.si8.es4.composite.exemplo;

public abstract class Movimentacao {

	private String nome;

	public Movimentacao(String nome) {
		this.nome = nome;
	}

	public abstract double getValor();

	public void imprimir() {
		System.out.println(nome + " = " + getValor());
	}

	public String getNome() {
		return nome;
	}
}
