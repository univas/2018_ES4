package br.edu.univas.si8.es4.composite.exemplo;

public class Despesa extends Movimentacao {

	private double valor;

	public Despesa(String nome, double valor) {
		super(nome);
		this.valor = valor;
	}

	@Override
	public double getValor() {
		return - valor;
	}

}
