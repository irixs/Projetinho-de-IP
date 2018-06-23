package Classes;

public class Venda {
	private Cliente Pessoa;
	private Produto livro;
	private double total;
	
	public Venda (Cliente a,Produto b,double c) {
		this.Pessoa = a;
		this.livro = b;
		this.total = c;
	}
	
	public double precoFinal (Integer nivel, double preco) {
		if (nivel == null) {
			this.total = preco;
		}else {
			this.total = preco - (nivel*0.05)*preco;
		}
		return total;
	}
}
