package Livro.livro;

import Livro.exception.AnoInvalidoException;

public class LivroAcademico extends Livro {
	public LivroAcademico (String titulo, int ano) throws AnoInvalidoException {
		super (titulo, ano);
		this.calcularPreco(ano);
	}
	public void calcularPreco(int ano) {
		double valor = 2018 - ano*0.25;
		this.setPreco(valor);
	}
}