package Sebo;

import Cliente.cliente.*;
import Cliente.exception.*;
import Cliente.negocio.*;
import Livro.livro.*;
import Livro.exception.*;
import Livro.negocio.*;
import Venda.venda.*;
import Venda.negocio.*;
import Venda.exception.*;

public class Sebo {
	private CadastroClientes clientes;
	private CadastroLivro livros;
	private CadastroVenda vendas;
	public Sebo(CadastroClientes clientes, CadastroLivro livros, CadastroVenda vendas) {
		this.clientes = clientes;
		this.livros = livros;
		this.vendas = vendas;
	}
	public void cadastrarCliente (Cliente cliente) throws ClienteJaCadastradoException {
		this.clientes.cadastrar(cliente);
	}
	public void removerCliente (String cpf) throws ClienteNaoExisteException {
		this.clientes.remover(cpf);
	}
	public void atualizarCliente (Cliente cliente) throws ClienteNaoExisteException {
		this.clientes.atualizar(cliente);
	}
	public Cliente procurarCliente (String cpf) throws ClienteNaoExisteException {
		return this.clientes.procurar(cpf);
	}
	public void mudarPlano (String cpf, Integer plano) throws PlanoInvalidoException, ClienteNaoExisteException {
		this.clientes.mudarPlano(cpf, plano);
	}
	public void cadastrarLivro (Livro livro) throws AnoInvalidoException {
		this.livros.cadastrar(livro);
	}
	public Livro procurarLivro (String titulo, int ano) throws LivroNaoEncontradoException {
		return this.livros.procurar(titulo, ano);
	} 
	public void removerLivro (String titulo, int ano) throws LivroNaoEncontradoException {
		this.livros.remover(titulo, ano);
	}
	public void atualizarLivro (Livro livro) throws LivroNaoEncontradoException {
		this.livros.atualizar(livro);
	}
	public void cadastrarVenda (String cpf, String titulo, int ano, int codigo) throws ClienteNaoExisteException, LivroNaoEncontradoException, CodigoDeVendaEmUsoException {	
		Cliente cliente = this.clientes.procurar(cpf);
		Livro livro = this.livros.procurar(titulo, ano);
		this.vendas.cadastrar(new Venda(cliente, livro, codigo));
		this.livros.remover(titulo, ano);
	}
	public void removerVenda (int codigo) throws VendaNaoEncontradaException {
		this.vendas.remover(codigo);
	}
	public void atualizarVenda (Venda venda) throws VendaNaoEncontradaException {
		this.vendas.atualizar(venda);
	}
	public Venda procurarVenda (int codigo) throws VendaNaoEncontradaException {
		return this.vendas.procurar(codigo);
	}
}
