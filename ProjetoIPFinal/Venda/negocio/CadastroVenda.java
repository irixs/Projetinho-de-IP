package Venda.negocio;

import Venda.repositorio.*;
import Venda.venda.*;
import Venda.exception.*;

public class CadastroVenda {
	private RepositorioVenda repositorioVenda;
	
	public CadastroVenda (RepositorioVenda repositorio) {
		this.repositorioVenda = repositorio;
	}
	
	public void cadastrar (Venda venda) throws CodigoDeVendaEmUsoException {
		if (!this.repositorioVenda.existe(venda.getCodigo())) {
			this.repositorioVenda.inserir(venda);
		} else throw new CodigoDeVendaEmUsoException(venda.getCodigo());
	}
	
	public void remover (int codigo) throws VendaNaoEncontradaException {
		if (this.repositorioVenda.existe(codigo)) {
			this.repositorioVenda.remover(codigo);
		} else throw new VendaNaoEncontradaException(codigo);
	}
	
	public void atualizar (Venda venda) throws VendaNaoEncontradaException {
		if (this.repositorioVenda.existe(venda.getCodigo())) {
			this.repositorioVenda.atualizar(venda);
		} else throw new VendaNaoEncontradaException(venda.getCodigo());
	}
	
	public Venda procurar (int codigo) throws VendaNaoEncontradaException {
		if (this.repositorioVenda.existe(codigo)) {
			return this.repositorioVenda.procurar(codigo);
		} else throw new VendaNaoEncontradaException(codigo);
	}

}
