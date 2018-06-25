package UI;

import Sebo.*;
import Livro.repositorio.*;
import Cliente.repositorio.*;
import Venda.repositorio.*;
import Livro.negocio.*;
import Cliente.negocio.*;
import Venda.exception.CodigoDeVendaEmUsoException;
import Venda.exception.VendaNaoEncontradaException;
import Venda.negocio.*;
import Cliente.cliente.*;
import Cliente.exception.ClienteInvalidoException;
import Cliente.exception.ClienteJaCadastradoException;
import Cliente.exception.ClienteNaoExisteException;
import Cliente.exception.PlanoInvalidoException;
import Livro.exception.AnoInvalidoException;
import Livro.exception.LivroNaoEncontradoException;
import Livro.livro.*;
import Venda.venda.*;

public class Programa {
	public static void main(String[] args) {
		RepositorioLivro X = new RepositorioLivroLista ();
		RepositorioCliente Y = new RepositorioClienteLista ();
		RepositorioVenda Z = new RepositorioVendaLista ();
		CadastroLivro X1 = new CadastroLivro(X);
		CadastroClientes Y1 = new CadastroClientes(Y);
		CadastroVenda Z1 = new CadastroVenda(Z);
		Sebo sebo = new Sebo(Y1, X1, Z1);
		try {
			sebo.cadastrarCliente(new Cliente("1231231"));
		} catch (ClienteJaCadastradoException e) {
			System.out.println(e.getMessage());            
		} catch (ClienteInvalidoException e) {
			System.out.println(e.getMessage());					 
		} 
		try {
			sebo.cadastrarCliente(new Cliente("12312312312"));
			sebo.cadastrarCliente(new Cliente("12312312312"));
		} catch (ClienteJaCadastradoException e) {
			System.out.println(e.getMessage());
		} catch (ClienteInvalidoException e) {							
			System.out.println(e.getMessage());
		} 
		try {
			sebo.removerCliente("12312344455");
		} catch (ClienteNaoExisteException e) {
			System.out.println(e.getMessage());
		}
		try {
			Cliente c = sebo.procurarCliente("12312312312");
			System.out.println(c.getPlano());
			sebo.mudarPlano("12312312312", 3);
			System.out.println(c.getPlano());
			sebo.mudarPlano("12312312312", 5);
		} catch (ClienteNaoExisteException e) {
			System.out.println(e.getMessage());
		} catch (PlanoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		try {
			Cliente A = new Cliente("12312312312");
			A.setPlano(2);
			sebo.atualizarCliente(A);
		} catch (ClienteInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (ClienteNaoExisteException e) {
			System.out.println(e.getMessage());
		} 
		try {
			sebo.removerCliente("12312312312");
		} catch (ClienteNaoExisteException e) {
			System.out.println(e.getMessage());
		} 
		try {
			sebo.cadastrarLivro(new LivroLiterario("Orgulho e preconceito", 1952));
			sebo.cadastrarLivro(new LivroLiterario("Orgulho e preconceito", 1952));
			sebo.cadastrarLivro(new LivroLiterario("Orgulho e preconceito", 1952));
			sebo.cadastrarLivro(new HQ("Batman: A piada mortal", 2017));
			sebo.cadastrarLivro(new HQ("Batman: A piada mortal", 1988));
			sebo.cadastrarLivro(new LivroAcademico("Principios Matematicos da filosofia natural", 1687));
			Livro A = new LivroLiterario("Orgulho e preconceito", 1952);
			sebo.atualizarLivro(A);
			sebo.removerLivro("Orgulho e preconceito", 1952);
			sebo.removerLivro("Orgulho e preconceito", 1923);
		} catch (AnoInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (LivroNaoEncontradoException e) {
			System.out.println(e.getMessage());
		} 
		try {
			Livro Teste = sebo.procurarLivro("Orgulho e preconceito", 1952);
			System.out.println(Teste.getTitulo());
			System.out.println(Teste.getAno());
			System.out.println(Teste.getPreco());
		} catch (LivroNaoEncontradoException e) {
			System.out.println(e.getMessage());
		} 
		try {
			sebo.cadastrarCliente(new Cliente("11111111111"));
			sebo.cadastrarCliente(new Cliente("11111123111"));
			sebo.cadastrarCliente(new Cliente("44411111111"));
			sebo.cadastrarVenda("44411111111", "Orgulho e preconceito", 1952, 35);
			Venda teste = sebo.procurarVenda(35);
			System.out.println(teste.getCliente().getCPF());
			System.out.println(teste.getTotal());
			System.out.println(teste.getLivro().getTitulo());
			sebo.mudarPlano("44411111111", 2);
			sebo.removerVenda(35);
			sebo.cadastrarVenda("44411111111", "Orgulho e preconceito", 1952, 21);
			Venda teste2 = sebo.procurarVenda(21);
			System.out.println(teste2.getCliente().getCPF());
			System.out.println(teste2.getTotal());
			System.out.println(teste2.getLivro().getTitulo());
			sebo.cadastrarVenda("11111123111", "Batman: A piada mortal", 1988, 35);
			sebo.cadastrarVenda("11111123111", "Batman: A piada mortal", 2017, 35);
		} catch (ClienteJaCadastradoException e) {
			System.out.println(e.getMessage());
		} catch (ClienteInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (ClienteNaoExisteException e) {
			System.out.println(e.getMessage());
		} catch (LivroNaoEncontradoException e) {
			System.out.println(e.getMessage());;
		} catch (CodigoDeVendaEmUsoException e) {
			System.out.println(e.getMessage());
		} catch (VendaNaoEncontradaException e) {
			System.out.println(e.getMessage());
		} catch (PlanoInvalidoException e) {
			System.out.println(e.getMessage());
		} 
	}
}
