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
import Livro.exception.AnoInvalidoException;
import Livro.exception.LivroNaoEncontradoException;
import Livro.livro.*;
import Venda.venda.*;

public class Programa {
	public static void main(String[] args) {
		RepositorioLivro X = new RepositorioLivroArray (100);
		RepositorioCliente Y = new RepositorioClienteLista();
		RepositorioVenda Z = new RepositorioVendaArray (200);
		CadastroLivro X1 = new CadastroLivro(X);
		CadastroClientes Y1 = new CadastroClientes(Y);
		CadastroVenda Z1 = new CadastroVenda(Z);
		Sebo sebo = new Sebo(Y1, X1, Z1);
		try {
			sebo.cadastrarCliente(new Cliente("12312312312"));
			System.out.println("teste");
			sebo.cadastrarLivro(new HQ("Avengers: Infinity War", 2004));
			sebo.cadastrarVenda("12312312312", "Avengers: Infinity War", 2004, 427);
			System.out.println("cheguei aqui");
			System.out.println(sebo.procurarVenda(427).getTotal());
			System.out.println(sebo.procurarVenda(427).getCliente().getCPF());
			System.out.println(sebo.procurarVenda(427).getLivro().getTitulo());
		} catch (ClienteJaCadastradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClienteInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AnoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClienteNaoExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LivroNaoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CodigoDeVendaEmUsoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (VendaNaoEncontradaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}
}
