package br.inatel.ec.ec206.abstractdaofactory;

public class XMLDAOFactory extends AbstractDAOFactory {

	@Override
	public PedidoDAO createPedidoDAO() {
		return new PedidoDAOXML();
	}

	@Override
	public ProdutoDAO createProdutoDAO() {
		return new ProdutoDAOXML();
	}

}
