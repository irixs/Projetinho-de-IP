package livromodificações;

public class LivroNaoEncontradoException extends Exception{
	public LivroNaoEncontradoException () {
		super ("Livro nao encontrado no estoque");
	}
}
