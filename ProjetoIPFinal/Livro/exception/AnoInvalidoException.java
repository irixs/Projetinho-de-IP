package Livro.exception;
 
public class AnoInvalidoException extends Exception {
	public AnoInvalidoException () {
		super ("Ano de edi��o invalido, insira um ano entre 1900 e 2018");
	}
}
