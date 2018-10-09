package br.edu.univas.si8.es4.decorator.cafeteria;

public class Cafe implements Produto {

	@Override
	public double getValor() {
		return 1.5;
	}

	@Override
	public void imprimir() {
		System.out.print("Café");
	}

}
