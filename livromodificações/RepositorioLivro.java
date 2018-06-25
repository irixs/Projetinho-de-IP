package livromodificações;

public interface RepositorioLivro {
	void inserir (Livro livro);
	void remover (String titulo);
	Livro procurar (String titulo);
	void atualizar (Livro livro);
	boolean existe (String titulo);
}
