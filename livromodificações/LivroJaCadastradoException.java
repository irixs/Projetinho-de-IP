package livromodifica��es;

public class LivroJaCadastradoException extends Exception {
	public LivroJaCadastradoException() {
		super ("Livro ja foi cadastrado no estoque");
	}
}
