package Livro.repositorio;

import Livro.livro.*;

public class RepositorioLivroArray implements RepositorioLivro {
	private Livro[] livro;
	private int Indice;

	public RepositorioLivroArray(int tam) {
		this.livro = new Livro [tam];
		this.Indice = 0;
	}
	public void inserir (Livro livro) {
		if (this.Indice != this.livro.length) {
			this.livro[this.Indice] = livro;
			this.Indice++;
		} 
		else {
			Livro[] aux = new Livro[2 * this.livro.length];
			for (int a = 0; a < this.Indice; a++) {
				aux[a] = this.livro[a];
			}
			this.livro = aux;
			inserir(livro);
		}
	}

	public Livro procurar (String titulo, int ano) {
		for (int i = 0; i < this.Indice; i++) {
			if (this.livro[i].getTitulo().equals(titulo) && this.livro[i].getAno() == ano) {
				return this.livro[i];
			}
		}
		return null;
	}

	public void remover (String titulo, int ano) {
		boolean aux = false;
		for (int b = 0; b < this.Indice; b++) {
			if (this.livro[b].getTitulo().equals(titulo) && this.livro[b].getAno() == ano && !aux) {
				this.livro[b] = null;
				aux = true;
			}
			if (aux) {
				if (b < this.Indice - 1) {
					this.livro[b] = this.livro[b + 1];
				}
			}
		}
		this.Indice--;
	}

	public void atualizar(Livro livro) {
		for (int a = 0; a < this.Indice; a++) {
			if (this.livro[a].getTitulo().equals(livro.getTitulo())) {
				this.livro[a] = livro;
			}
		}
	}
	
	public boolean existe(String titulo, int ano) {
		for (int a = 0; a < this.Indice; a++) {
			if (this.livro[a].getTitulo().equals(titulo) && this.livro[a].getAno() == ano) {
				return true;
			}
		}
		return false;
	}
}