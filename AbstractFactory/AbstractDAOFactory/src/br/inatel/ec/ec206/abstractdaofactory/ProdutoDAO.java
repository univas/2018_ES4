package br.inatel.ec.ec206.abstractdaofactory;

import java.util.List;

public interface ProdutoDAO {

	void insertProduto(ProdutoTO produto);
	
	List<ProdutoTO> listProdutos();

}
