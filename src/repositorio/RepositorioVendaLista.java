package repositorio;

public class RepositorioVendaLista {
	private Venda venda;
	private RepositorioVendaLista proximo;
	
	public RepositorioVendaLista() {
		this.venda = null;
		this.proximo = null;
	}
	public void adicionar (Venda a) {
		if (this.venda == null) {
			this.venda = a;
			this.proximo = new RepositorioVendaLista();
			System.out.println("Venda cadastrado com Sucesso");
		}else {
			this.proximo.adicionar(a);
		}
	}
	// public void retirar (Venda a) {
	//	if (this.venda == a) {
	//		this.venda = this.proximo.venda;
	//		this.proximo = this.proximo.proximo;
	//		System.out.println("Venda retirada com sucesso");
	//	}else {
	//		this.proximo.retirar(a);
	//	}
	//}
}