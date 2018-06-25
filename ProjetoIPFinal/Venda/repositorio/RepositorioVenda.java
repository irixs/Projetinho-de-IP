package Venda.repositorio;

import Venda.venda.*;

public interface RepositorioVenda {
	void inserir (Venda venda);
	void remover (int codigo);
	Venda procurar (int codigo);
	void atualizar (Venda venda);
	boolean existe (int codigo);
}
