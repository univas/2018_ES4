package br.edu.univas.si8.es4.exemplo.factorymethod;

public class Mensalista extends Funcionario {

	private double salarioMensal;
	private int horasExtras;

	@Override
	public double getSalario() {
		return salarioMensal + (horasExtras * salarioMensal / 160);
	}

	@Override
	public CalculadoraImposto createCalculadora() {
		return new CalculadoraImpostoPorMes(getSalario());
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

}
