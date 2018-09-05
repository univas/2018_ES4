package br.inatel.ec.ec206.abstractdaofactory;

import static br.inatel.ec.ec206.abstractdaofactory.AbstractDAOFactory.TIPO_XML;
import static br.inatel.ec.ec206.abstractdaofactory.AbstractDAOFactory.TIPO_RDB;

public class Runner {

	public static void main(String[] args) {
		AbstractDAOFactory factory = AbstractDAOFactory.getFactory(TIPO_XML);
		
		PedidoDAO pedidoDAO = factory.createPedidoDAO();
		pedidoDAO.insertPedido(new PedidoTO());
		pedidoDAO.listPedidos();
		
		ProdutoDAO produtoDAO = factory.createProdutoDAO();
		produtoDAO.insertProduto(new ProdutoTO());
		produtoDAO.listProdutos();
	}
	
}
