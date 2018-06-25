package Venda.repositorio;

import Venda.venda.*;

public class RepositorioVendaLista implements RepositorioVenda {
	private Venda venda;
	private RepositorioVendaLista prox;
	
	public RepositorioVendaLista() {
		this.venda = null;
		this.prox = null;
	}

	public void inserir (Venda venda) {
		if (this.venda == null) {
			this.venda = venda;
			this.prox = new RepositorioVendaLista();
		}else {
			this.prox.inserir (venda);
		}
	}

	public boolean existe (int codigo) {
		if (this.venda != null && this.venda.getCodigo() == codigo) { 
			return true;
		}else if (this.prox == null) {
			return false;
		} else return this.prox.existe(codigo);
	}

	public void remover (int codigo) {
		if (this.venda != null && this.venda.getCodigo() == codigo) {
			this.venda = this.prox.venda;
			this.prox = this.prox.prox;
		}else {
			this.prox.remover (codigo);
		}
	}
	
	public Venda procurar (int codigo) {
		if (this.venda != null && this.venda.getCodigo() == codigo) {
			return this.venda;
		} else if (this.prox.venda != null) {
			return this.prox.procurar(codigo);
		} else return null;
	}
	
	public void atualizar (Venda venda) {
		if (this.venda != null && this.venda.getCodigo() == venda.getCodigo()) {
			this.venda = venda;
		} else this.prox.atualizar(venda);
	}
}