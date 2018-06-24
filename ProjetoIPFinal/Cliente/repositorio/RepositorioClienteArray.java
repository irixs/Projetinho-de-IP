package Cliente.repositorio;

import Cliente.cliente.*;

public class RepositorioClienteArray implements RepositorioCliente {
	private Cliente[] clientes;
	private int Indice;
	public RepositorioClienteArray (int tam) {
		this.clientes = new Cliente[tam];
		this.Indice = 0;
	}
	public void inserir (Cliente cliente) {
		if (this.Indice != clientes.length) {
			clientes[this.Indice] = cliente;
			this.Indice++;
		} else {
			Cliente[] aux = new Cliente[2 * clientes.length];
			for (int a = 0; a < this.Indice; a++) {
				aux[a] = clientes[a];
			}
			this.clientes = aux;
			inserir(cliente);
		}
	}
	public void remover (String cpf) {
		boolean removeu = false;
		for (int b = 0; b < this.Indice; b++) {
			if (clientes[b].getCPF().equals(cpf) && !removeu) {
				clientes[b] = null;
				removeu = true;
			}
			if (removeu) {
				if (b < this.Indice - 1) {
					clientes[b] = clientes[b + 1];
				}
			}
		}
		this.Indice--;
	}
	public Cliente procurar (String cpf) {
		for (int a = 0; a < this.Indice; a++) {
			if (clientes[a].getCPF().equals(cpf)) {
				return clientes[a];
			}
		}
		return null;
	}
	public void atualizar (Cliente cliente) {
		for (int a = 0; a < this.Indice; a++) {
			if (clientes[a].getCPF().equals(cliente.getCPF())) {
				clientes[a] = cliente;
			}
		}
	}
	public boolean existe (String numero) {
		for (int a = 0; a < this.Indice; a++) {
			if (clientes[a].getCPF().equals(numero)) {
				return true;
			}
		}
		return false;
	}
}