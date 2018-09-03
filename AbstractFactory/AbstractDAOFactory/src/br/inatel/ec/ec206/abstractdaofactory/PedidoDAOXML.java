package br.inatel.ec.ec206.abstractdaofactory;

import java.util.List;

public class PedidoDAOXML implements PedidoDAO {

	@Override
	public void insertPedido(PedidoTO pedido) {
		System.out.println("Inserindo pedido em arquivo XML");
	}

	@Override
	public List<PedidoTO> listPedidos() {
		System.out.println("Listando pedido em arquivo XML");
		return null;
	}

}
