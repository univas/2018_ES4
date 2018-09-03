package br.inatel.ec.ec206.abstractdaofactory;

import java.util.List;

public interface PedidoDAO {

	void insertPedido(PedidoTO pedido);
	
	List<PedidoTO> listPedidos();
	
}
