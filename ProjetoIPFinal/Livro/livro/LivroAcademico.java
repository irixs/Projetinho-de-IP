package Livro.livro;

import Livro.exception.AnoInvalidoException;

public class LivroAcademico extends Livro {
	public LivroAcademico (String titulo, int ano) throws AnoInvalidoException {
		super (titulo, ano);
		this.calcularPreco(ano);
	}
	public void calcularPreco(int ano) {
		Double valor = 2018.0 - ano*0.25;
		if (valor < 5.0) {
			valor = 5.0;
		}
		this.setPreco(valor);
	}
}