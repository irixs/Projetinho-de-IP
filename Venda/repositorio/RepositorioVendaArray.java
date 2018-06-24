package inferno;

public class RepositorioVendaArray {
	private Venda [] venda;

	public RepositorioVendaArray() {
		venda = new Venda [3];
	}

	public void inserir (Venda venda) {
		for (int i=0; i < venda.length; i++) {
			if (venda[i] == null) {
				venda[i] = venda;
				System.out.println("Venda adicionada com sucesso");
				return;
			}
		}
		Venda[] venda2 = new Venda [venda.length * 2];

		for (int i=0; i<venda.length; i++) {
			venda2[i] = venda[i];
		}
		this.venda = venda2;
		inserir(venda);
	}

	public boolean existe (int codigo) {
		boolean achou = false;
		for (int i=0; i< venda.length && !achou; i++) {
			if (venda[i].getCodigo() == codigo) {
				achou = true;
			}
		}return achou;
	}

	public void remover (int codigo) {
		for (int i=0; i< venda.length; i++) {
			if (venda[i].getCodigo() == codigo) {
				venda[i] = null ;
			}

		}

	}

}
