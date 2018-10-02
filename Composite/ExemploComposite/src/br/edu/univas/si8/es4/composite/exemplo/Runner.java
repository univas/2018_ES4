package br.edu.univas.si8.es4.composite.exemplo;

public class Runner {

	public static void main(String[] args) {
		Despesa restaurante = new Despesa("Restaurante", 240);
		// restaurante.imprimir();
		Receita salario = new Receita("Salário", 980);
		// salario.imprimir();
		Grupamento pessoal = new Grupamento("Pessoal");
		pessoal.add(restaurante);
		pessoal.add(salario);
		// pessoal.imprimir();
		Grupamento faculdade = new Grupamento("Faculdade");
		faculdade.add(new Despesa("Mensalidade", 1100));
		faculdade.add(new Receita("Monitoria", 500));
		Grupamento geral = new Grupamento("Geral");
		geral.add(pessoal);
		geral.add(faculdade);
		geral.imprimir();
	}
}
