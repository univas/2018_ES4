package br.edu.univas.si8.es4.chainofresponsibility;

public class PedidoDAOLocal extends PedidoDAO {

	@Override
	public void inserir(Pedido pedido) {
		// Tenta inserir pedido no banco local...
		System.out.println("Dado inserido na base local!!!");
	}
}
