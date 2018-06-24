package Livro.negocio;

import Livro.livro.*;
import Livro.exception.*;
import Livro.repositorio.*;

public class CadastroLivro {
	private RepositorioLivro repositorioLivro;
	public CadastroLivro (RepositorioLivro repositorio) {
		this.repositorioLivro = repositorio;
	}
	public void cadastrar (Livro livro)  {
		this.repositorioLivro.inserir(livro);
	}
	public void remover (String titulo, int ano) throws LivroNaoEncontradoException {
		if (this.repositorioLivro.existe(titulo, ano)) {
			this.repositorioLivro.remover(titulo, ano);
		} else throw new LivroNaoEncontradoException();
	}
	public void atualizar (Livro livro) throws LivroNaoEncontradoException {
		if (this.repositorioLivro.existe(livro.getTitulo(), livro.getAno())) {
			this.repositorioLivro.atualizar(livro);
		} else throw new LivroNaoEncontradoException();
	}
	public Livro procurar (String titulo, int ano) throws LivroNaoEncontradoException {
		if (this.repositorioLivro.existe(titulo, ano)) {
			return this.repositorioLivro.procurar(titulo, ano);
		} else throw new LivroNaoEncontradoException();
	}
}