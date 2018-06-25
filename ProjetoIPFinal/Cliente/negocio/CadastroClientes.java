package Cliente.negocio;

import Cliente.exception.*;
import Cliente.repositorio.*;
import Cliente.cliente.*;

public class CadastroClientes {
	private RepositorioCliente clientes;
	public CadastroClientes (RepositorioCliente repositorio) {
		this.clientes = repositorio;
	}
	public void cadastrar (Cliente cliente) throws ClienteJaCadastradoException {
		if (!this.clientes.existe(cliente.getCPF())) {
			this.clientes.inserir(cliente);
		} else throw new ClienteJaCadastradoException (cliente);
	}
	public void remover (String cpf) throws ClienteNaoExisteException {
		if (this.clientes.existe(cpf)) {
			this.clientes.remover(cpf);
		} else throw new ClienteNaoExisteException(cpf);
	}
	public void atualizar (Cliente cliente) throws ClienteNaoExisteException {
		if (this.clientes.existe(cliente.getCPF())) {
			this.clientes.atualizar(cliente);
		} else throw new ClienteNaoExisteException(cliente.getCPF());
	}
	public Cliente procurar (String cpf) throws ClienteNaoExisteException {
		if (this.clientes.existe(cpf)) {
			return this.clientes.procurar(cpf);
		} else throw new ClienteNaoExisteException (cpf);
	}
	public void mudarPlano (String cpf, Integer plano) throws PlanoInvalidoException, ClienteNaoExisteException {
		if (plano > 0 && plano < 4) {
			if (this.clientes.existe(cpf)) {
				this.clientes.procurar(cpf).setPlano(plano);
			} else throw new ClienteNaoExisteException(cpf);
		} else throw new PlanoInvalidoException(cpf);
	}
}