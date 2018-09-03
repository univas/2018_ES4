package br.inatel.ec.ec206.abstractdaofactory;

import java.util.List;

public class PedidoDAORDB implements PedidoDAO {

	@Override
	public void insertPedido(PedidoTO pedido) {
		System.out.println("Inserindo pedido em banco relacional");
	}

	@Override
	public List<PedidoTO> listPedidos() {
		System.out.println("Listando pedido em banco relacional");
		return null;
	}

}
