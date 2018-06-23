package Classes;

public class ExcecaoVendaProdutoInvalido extends Exception {
	public ExcecaoVendaProdutoInvalido() {
		super("Livro nao encontrado");
	}
}
