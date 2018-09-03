package br.inatel.ec.ec206.abstractdaofactory;

import java.util.List;

public class ProdutoDAORDB implements ProdutoDAO {

	@Override
	public void insertProduto(ProdutoTO produto) {
		System.out.println("Inserindo produto em banco relacional.");
	}

	@Override
	public List<ProdutoTO> listProdutos() {
		System.out.println("Listando produto em banco relacional");
		return null;
	}

}
