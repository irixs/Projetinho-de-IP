package Livro.exception;
 
public class AnoInvalidoException extends Exception {
	public AnoInvalidoException (String titulo, int ano) {
		super ("Ano de edição invalido para o livro " + titulo + " de ano " + ano);
	}
}
