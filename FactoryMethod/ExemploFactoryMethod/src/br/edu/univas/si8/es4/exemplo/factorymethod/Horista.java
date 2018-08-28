package br.edu.univas.si8.es4.exemplo.factorymethod;

public class Horista extends Funcionario {

	private double valorHora;
	private int horasTrabalhadas;

	@Override
	public double getSalario() {
		return valorHora * horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

}
