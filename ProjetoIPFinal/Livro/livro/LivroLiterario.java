package Livro.livro;

import Livro.exception.AnoInvalidoException;

public class LivroLiterario extends Livro {
	public LivroLiterario (String titulo, int ano) throws AnoInvalidoException {
		super (titulo, ano);
		this.calcularPreco(ano);
	}
	public void calcularPreco(int ano) {
		double valor = ano * 0.01;
		this.setPreco(valor);
	}
}