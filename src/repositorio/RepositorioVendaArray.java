package repositorio;

public class RepositorioVendaArray {
	private Venda [] Array;
	
	public ArrayVenda() {
		Array = new Venda [3];	
	}
	
	public void adicionar (Venda a ) {
		for (int i = 0;i < Array.length;i++) {
			if (Array[i] == null) {
				Array[i]= a;
				System.out.println("Venda adicionada com sucesso");
				return;
			}
		}
		Venda[] Array2 = new Venda [Array.length * 2];
		
		for (int i = 0;i < Array.length;i++) {
			Array2[i]=Array[i];
		}
		this.Array = Array2;
		adicionar(a);
	}
}