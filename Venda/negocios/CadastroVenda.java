package inferno;

public class CadastroVenda {
	private RepositorioVenda repositorioVenda;
	
	public CadastroVenda (Repositorio repositorio) {
		this.repositorioVenda = repositorio;
	}
	
	public void cadastrar (Venda venda) {
		this.repositorioVenda.inserir(venda);
	}
	
	public 

}
