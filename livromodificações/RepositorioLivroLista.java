package livromodificações;

public class RepositorioLivroLista implements RepositorioLivro {
	private Livro livro;
	private RepositorioLivroLista prox;
	public RepositorioLivroLista () {
		this.livro = null;
		this.prox = null;
	}
	public void inserir(Livro livro) {
		if (this.livro == null) {
			this.livro = livro;
			this.prox = new RepositorioLivroLista();
		} 
		else {
			this.prox.inserir(livro);
		}
	}
	public void remover(String titulo) {
		if (this.livro != null && this.livro.getTitulo().equals(titulo)) {
			this.livro = this.prox.livro;
			this.prox = this.prox.prox;
		} 
		else {
			this.prox.remover(titulo);
		}
	}
	public boolean existe (String titulo) {
		if (this.livro != null && this.livro.getTitulo().equals(titulo)) {
			return true;
		} 
		else if (this.livro == null) {
			return false;
		} 
		else {
			return this.prox.existe(titulo);
		}
	}

	public Livro procurar(String titulo) {
		if (this.livro != null && this.livro.getTitulo().equals(titulo)) {
			return this.livro;
		} else if (this.prox.livro != null) {
			return this.prox.procurar(titulo);
		} else return null;
	}
	
	public void atualizar(Livro livro) {
		if (this.livro != null && this.livro.getTitulo().equals(livro.getTitulo())) {
			this.livro = livro;
		} else this.prox.atualizar(livro);
	}
}