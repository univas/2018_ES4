package br.edu.univas.si8.es4.chainofresponsibility;

import java.util.Random;

public class PedidoDAORegional extends PedidoDAO {

	@Override
	public void inserir(Pedido pedido) {
		// Tenta inserir pedido no banco regional...
		boolean inseriu = new Random().nextInt(100) < 50;
		if (inseriu) {
			System.out.println("Dado inserido na base regional!!!");
		} else {
			super.inserir(pedido);
		}
	}
}
