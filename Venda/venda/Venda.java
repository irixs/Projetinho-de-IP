package inferno;

public class Venda {
	private int codigo;
	private Cliente cliente;
	private Livro livro;
	private double total;

	public Venda (Cliente cliente, Livro livro, int codigo) {
		this.codigo = codigo;
		this.Pessoa = pessoa;
		this.livro = livro;
		this.total = calcularTotal(cliente.getPlano(), livro.getPreco());
	}

	public double calcularTotal (Integer nivel, double preco) {
		this.total = preco - (nivel*0.05)*preco;
		return total;
	}
	
	public Cliente getCliente {
		return this.cliente;
	}
	
	public Livro getLivro {
		return this.livro;
	}
	
	public double getTotal {
		return this.total;
	}
	
	public int getCodigo {
		return this.codigo;
	}

}

