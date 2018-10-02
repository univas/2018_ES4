package br.edu.univas.si8.es4.composite.exemplo;

import java.util.ArrayList;
import java.util.List;

public class Grupamento extends Movimentacao {

	private List<Movimentacao> children = new ArrayList<>();

	public Grupamento(String nome) {
		super(nome);
	}

	public void add(Movimentacao child) {
		children.add(child);
	}

	@Override
	public void imprimir() {
		System.out.println(getNome());
		children.forEach(Movimentacao::imprimir);
		System.out.println("Total (" + getNome() + ") = " + getValor());
	}

	@Override
	public double getValor() {
		return children.stream().mapToDouble(Movimentacao::getValor).sum();
	}

}
