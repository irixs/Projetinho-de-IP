package Cliente;

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
	public void remover (Cliente cliente) throws ClienteNaoExisteException {
		if (this.clientes.existe(cliente.getCPF())) {
			this.clientes.remover(cliente);;
		} else throw new ClienteNaoExisteException(cliente.getCPF());
	}
	public void atualizar (Cliente cliente) throws ClienteNaoExisteException {
		if (this.clientes.existe(cliente.getCPF())) {
			this.clientes.atualizar(cliente);
		} else throw new ClienteNaoExisteException(cliente.getCPF());
	}
	public void mudarPlano (String cpf, Integer plano) throws ClienteNaoExisteException {
		if (this.clientes.existe(cpf)) {
			this.clientes.procurar(cpf).setNivel(plano);
		} else throw new ClienteNaoExisteException(cpf);
	}
}