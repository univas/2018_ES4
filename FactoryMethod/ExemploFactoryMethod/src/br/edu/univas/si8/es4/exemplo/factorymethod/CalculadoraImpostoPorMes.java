package br.edu.univas.si8.es4.exemplo.factorymethod;

public class CalculadoraImpostoPorMes {

	private double salario;

	public CalculadoraImpostoPorMes(double salario) {
		this.salario = salario;
	}

	public double calcular() {
		return salario * .2;
	}

}
