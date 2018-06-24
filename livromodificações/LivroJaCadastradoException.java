package livromodificações;

public class LivroJaCadastradoException extends Exception {
	public LivroJaCadastradoException() {
		super ("Livro ja foi cadastrado no estoque");
	}
}
