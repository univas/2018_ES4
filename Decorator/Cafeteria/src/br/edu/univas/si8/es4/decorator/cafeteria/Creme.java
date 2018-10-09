package br.edu.univas.si8.es4.decorator.cafeteria;

public class Creme extends Decorator {

	public Creme(Produto alvo) {
		super(alvo);
	}

	@Override
	public double getValor() {
		return getAlvo().getValor() + 1;
	}

	@Override
	public void imprimir() {
		getAlvo().imprimir();
		System.out.print(" com Creme");
	}

}
