package br.edu.univas.si8.es4.exemplo.factorymethod;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<>();

		Horista horista = new Horista();
		horista.setComissao(.50);
		horista.setHorasTrabalhadas(100);
		horista.setValorHora(50);
		funcionarios.add(horista);

		Mensalista mensalista = new Mensalista();
		mensalista.setComissao(.50);
		mensalista.setSalarioMensal(3000);
		mensalista.setHorasExtras(15);
		funcionarios.add(mensalista);

		for (Funcionario funcionario : funcionarios) {
			System.out.println("Salário: " + funcionario.calcularSalarioLiquido());
		}
	}

}
