package br.inatel.ec.ec206.abstractdaofactory;

public abstract class AbstractDAOFactory {

	public static final int TIPO_XML = 1;
	public static final int TIPO_RDB = 2;

	public abstract PedidoDAO createPedidoDAO();

	public abstract ProdutoDAO createProdutoDAO();

	public static AbstractDAOFactory getFactory(int tipo) {
		switch (tipo) {
		case TIPO_XML:
			return new XMLDAOFactory();
		case TIPO_RDB:
			return new RDBDAOFactory();
		default:
			throw null;
		}
	}

}
