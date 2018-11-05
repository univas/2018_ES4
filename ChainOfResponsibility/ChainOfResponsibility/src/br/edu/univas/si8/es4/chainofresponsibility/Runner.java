package br.edu.univas.si8.es4.chainofresponsibility;

public class Runner {

	public static void main(String[] args) {
		PedidoDAO dao = construirCadeia();

		for (int i = 0; i < 1000; i++) {
			dao.inserir(null);
		}
	}

	private static PedidoDAO construirCadeia() {
		PedidoDAOCentral central = new PedidoDAOCentral();
		PedidoDAORegional regional = new PedidoDAORegional();
		PedidoDAOLocal local = new PedidoDAOLocal();
		central.setNext(regional);
		regional.setNext(local);
		return central;
	}
}
