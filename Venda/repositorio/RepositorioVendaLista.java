package inferno;

public class RepositorioVendaLista {
	private Venda venda;
	private RepositorioVendaLista prox;

	public RepositorioVendaLista() {
		this.venda = null;
		this.prox = null;
	}

	public void inserir (Venda venda) {
		if (this.venda == null) {
			this.venda = venda;
			this.prox = new RepositorioVendaLista();
		}else {
			this.prox.inserir (venda);
		}
	}

	public boolean existe (int codigo) {
		if (this.venda != null && this.venda.getCodigo() == codigo) { 
			return true;
		}else if (this.prox.venda != null) {
			return this.prox.existe(codigo);
		}return false;
	}

	public void remover (int codigo) {
		if (this.venda != null && this.venda.getCodigo() == codigo) {
			this.venda = this.prox.venda;
			this.prox = this.prox.prox;
			System.out.println("Venda retirada com sucesso");
		}else {
			this.prox.remover (codigo);
		}
	}
}

