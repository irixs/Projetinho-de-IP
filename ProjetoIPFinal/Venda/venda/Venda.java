package Venda.venda;

import Cliente.cliente.*;
import Livro.livro.*;

public class Venda {
	private int codigo;
	private Cliente cliente;
	private Livro livro;
	private double total;

	public Venda (Cliente cliente, Livro livro, int codigo) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.livro = livro;
		if (cliente.getPlano() != null) {
			this.total = livro.getPreco() - (cliente.getPlano()*0.05)*livro.getPreco();
		} else this.total = livro.getPreco();
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public Livro getLivro() {
		return this.livro;
	}
	
	public double getTotal() {
		return this.total;
	}
	
	public int getCodigo() {
		return this.codigo;
	}

}

