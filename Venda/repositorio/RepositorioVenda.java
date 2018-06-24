package inferno;

public interface RepositorioVenda {
	public interface RepositorioLivro {
		void inserir (Venda venda);
		void remover (String titulo);
		boolean existe (String titulo);
	}
}
