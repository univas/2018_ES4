package br.edu.univas.si8.es4.decorator.cafeteria;

public class Runner {

	public static void main(String[] args) {
		Cha cha = new Cha();
		Leite chaComLeite = new Leite(cha);
		Creme chaComLeiteECreme = new Creme(chaComLeite);
		apresentarProduto(chaComLeiteECreme);
	}

	private static void apresentarProduto(Produto produto) {
		produto.imprimir();
		System.out.println(": " + produto.getValor());
	}
	
}
