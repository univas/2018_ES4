package br.edu.univas.si8.es4.composite.exemplo;

public class Receita extends Movimentacao {

	private double valor;

	public Receita(String nome, double valor) {
		super(nome);
		this.valor = valor;
	}

	@Override
	public double getValor() {
		return valor;
	}

}
