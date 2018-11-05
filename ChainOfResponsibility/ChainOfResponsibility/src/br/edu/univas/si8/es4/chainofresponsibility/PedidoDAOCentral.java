package br.edu.univas.si8.es4.chainofresponsibility;

import java.util.Random;

public class PedidoDAOCentral extends PedidoDAO {

	@Override
	public void inserir(Pedido pedido) {
		// Tenta inserir pedido no banco central...
		boolean inseriu = new Random().nextInt(100) < 40;
		if (inseriu) {
			System.out.println("Dado inserido na base central!!!");
		} else {
			super.inserir(pedido);
		}
	}
}
