package br.edu.univas.si8.es4.exemplo.factorymethod;

public class CalculadoraImpostoPorHora implements CalculadoraImposto {

	private double salario;

	public CalculadoraImpostoPorHora(double salario) {
		this.salario = salario;
	}

	public double calcular() {
		return salario * .15;
	}

}
