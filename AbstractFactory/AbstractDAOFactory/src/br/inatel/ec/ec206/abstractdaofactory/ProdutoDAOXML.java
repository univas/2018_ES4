package br.inatel.ec.ec206.abstractdaofactory;

import java.util.List;

public class ProdutoDAOXML implements ProdutoDAO {

	@Override
	public void insertProduto(ProdutoTO produto) {
		System.out.println("Inserindo produto em XML.");
	}

	@Override
	public List<ProdutoTO> listProdutos() {
		System.out.println("Listando produto em XML");
		return null;
	}

}
