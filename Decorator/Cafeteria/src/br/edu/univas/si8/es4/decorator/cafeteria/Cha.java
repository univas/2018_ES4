package br.edu.univas.si8.es4.decorator.cafeteria;

public class Cha implements Produto {

	@Override
	public double getValor() {
		return 1;
	}

	@Override
	public void imprimir() {
		System.out.print("Chá");
	}

}
