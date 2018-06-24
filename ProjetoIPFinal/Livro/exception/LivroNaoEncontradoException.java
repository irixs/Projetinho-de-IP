package Livro.exception;

public class LivroNaoEncontradoException extends Exception{
	public LivroNaoEncontradoException () {
		super ("Livro nao encontrado no estoque");
	}
}
