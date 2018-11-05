package br.edu.univas.si8.es4.chainofresponsibility;

public abstract class PedidoDAO {

	private PedidoDAO next;

	public void inserir(Pedido pedido) {
		if (next != null) {
			next.inserir(pedido);
		} else {
			String message = "Não foi possível tratar a requisição.";
			throw new RuntimeException(message);
		}
	}

	public void setNext(PedidoDAO next) {
		this.next = next;
	}
}
