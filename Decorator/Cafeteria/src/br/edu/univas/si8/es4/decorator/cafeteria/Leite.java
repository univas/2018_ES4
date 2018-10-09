package br.edu.univas.si8.es4.decorator.cafeteria;

public class Leite extends Decorator {

	public Leite(Produto alvo) {
		super(alvo);
	}

	@Override
	public double getValor() {
		return getAlvo().getValor() + 2;
	}

	@Override
	public void imprimir() {
		getAlvo().imprimir();
		System.out.print(" com Leite");
	}

}
