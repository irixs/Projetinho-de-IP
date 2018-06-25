package Livro.exception;

public class LivroNaoEncontradoException extends Exception{
	public LivroNaoEncontradoException (String titulo, int ano) {
		super (titulo + " de ano " + ano + " nao foi encontrado no estoque");
	}
}
