package Venda.repositorio;

import Venda.venda.*;

public class RepositorioVendaArray implements RepositorioVenda {
	private Venda [] venda;
	private int Indice;
	public RepositorioVendaArray(int tam) {
		this.venda = new Venda[tam];
	}

	public void inserir (Venda venda) {
		if (this.Indice != this.venda.length) {
			this.venda[this.Indice] = venda;
			this.Indice++;
		} else {
			Venda[] aux = new Venda[2 * this.venda.length];
			for (int a = 0; a < this.Indice; a++) {
				aux[a] = this.venda[a];
			}
			this.venda = aux;
			inserir(venda);
		}
	}

	public boolean existe (int codigo) {
		boolean achou = false;
		for (int i=0; i< this.Indice && !achou; i++) {
			if (this.venda[i].getCodigo() == codigo) {
				return true;
			}
		}
		return false;
	}

	public void remover (int codigo) {
		boolean removeu = false;
		for (int b = 0; b < this.Indice; b++) {
			if (this.venda[b].getCodigo() == codigo && !removeu) {
				this.venda[b] = null;
				removeu = true;
			}
			if (removeu) {
				if (b < this.Indice - 1) {
					this.venda[b] = this.venda[b + 1];
				}
			}
		}
		this.Indice--;
	}
	
	public Venda procurar (int codigo) {
		for (int a = 0; a < this.Indice; a++) {
			if (this.venda[a].getCodigo() == codigo) {
				return this.venda[a];
			}
		}
		return null;
	}
	
	public void atualizar (Venda venda) {
		for (int a = 0; a < this.Indice; a++) {
			if (this.venda[a].getCodigo() == venda.getCodigo()) {
				this.venda[a] = venda;
			}
		}
	}
}
