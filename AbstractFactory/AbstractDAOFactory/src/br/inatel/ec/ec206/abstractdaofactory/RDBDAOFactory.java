package br.inatel.ec.ec206.abstractdaofactory;

public class RDBDAOFactory extends AbstractDAOFactory {

	@Override
	public PedidoDAO createPedidoDAO() {
		return new PedidoDAORDB();
	}

	@Override
	public ProdutoDAO createProdutoDAO() {
		return new ProdutoDAORDB();
	}

}
