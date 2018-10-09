package br.edu.univas.si8.es4.decorator.cafeteria;

public abstract class Decorator implements Produto {

	private Produto alvo;

	public Decorator(Produto alvo) {
		this.alvo = alvo;
	}

	protected Produto getAlvo() {
		return alvo;
	}

}
