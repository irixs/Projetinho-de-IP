package Cliente.repositorio;

import Cliente.cliente.*;

public class RepositorioClienteLista implements RepositorioCliente {
	private Cliente cliente;
	private RepositorioClienteLista prox;
	public RepositorioClienteLista () {
		this.cliente = null;
		this.prox = null;
	}
	public void inserir (Cliente cliente) {
		if (this.cliente == null) {
			this.cliente = cliente;
			this.prox = new RepositorioClienteLista();
		} else this.prox.inserir(cliente);
	}
	public void remover (String cpf) {
		if (this.cliente != null && this.cliente.getCPF().equals(cpf)) {
			this.cliente = this.prox.cliente;
			this.prox = this.prox.prox;
		} else this.prox.remover(cpf);
	}
	public Cliente procurar (String cpf) {
		if (this.cliente != null && this.cliente.getCPF().equals(cpf)) {
			return this.cliente;
		} else if (this.prox.cliente != null) {
			return this.prox.procurar(cpf);
		} else return null;
	}
	public void atualizar (Cliente cliente) {
		if (this.cliente != null && this.cliente.getCPF().equals(cliente.getCPF())) {
			this.cliente = cliente;
		} else this.prox.atualizar(cliente);
	}
	public boolean existe (String cpf) {
		if (this.cliente != null && this.cliente.getCPF().equals(cpf)) {
			return true;
		} else if (this.cliente == null) {
			return false;
		} else {
			return this.prox.existe(cpf);
		}
	}
}