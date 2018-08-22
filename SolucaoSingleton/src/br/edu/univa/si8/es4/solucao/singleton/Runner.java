package br.edu.univa.si8.es4.solucao.singleton;

public class Runner {

	public static void main(String[] args) {
		contar();
		
		resultadoContagem();
	}

	private static void contar() {
		Statistics.getInstance().count("palavra");
		Statistics.getInstance().count("palavra");
		Statistics.getInstance().count("abacate");
	}

	private static void resultadoContagem() {
		System.out.println("Contagem de palavra:" +
				Statistics.getInstance().counterValue("palavra"));
		System.out.println("Contagem de abacate:" +
				Statistics.getInstance().counterValue("abacate"));
	}
	
}
