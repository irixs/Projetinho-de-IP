package Livro.repositorio;

import Livro.livro.*;

public interface RepositorioLivro {
	void inserir (Livro livro);
	void remover (String titulo, int ano);
	Livro procurar (String titulo, int ano);
	void atualizar (Livro livro);
	boolean existe (String titulo, int ano);
}
