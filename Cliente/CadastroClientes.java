package Cliente;

public class CadastroClientes {
	private RepositorioCliente clientes;
	public CadastroClientes (RepositorioCliente repositorio) {
		this.clientes = repositorio;
	}
	public void cadastrar (Cliente cliente) throws ClienteJaCadastradoException, ClienteInvalidoException {
		if (cliente.getCPF().length() == 11) {
			if (!this.clientes.existe(cliente.getCPF())) {
				this.clientes.inserir(cliente);
			} else throw new ClienteJaCadastradoException (cliente);
		} else throw new ClienteInvalidoException (cliente.getCPF());
	}
	public void remover (String cpf) throws ClienteNaoExisteException, ClienteInvalidoException {
		if (cpf.length() == 11) {
			if (this.clientes.existe(cpf)) {
				this.clientes.remover(cpf);
			} else throw new ClienteNaoExisteException(cpf);
		} else throw new ClienteInvalidoException (cpf);
	}
	public void atualizar (Cliente cliente) throws ClienteNaoExisteException, ClienteInvalidoException {
		if (cliente.getCPF().length() == 11) {
			if (this.clientes.existe(cliente.getCPF())) {
				this.clientes.atualizar(cliente);
			} else throw new ClienteNaoExisteException(cliente.getCPF());
		} else throw new ClienteInvalidoException (cliente.getCPF());
	}
	public Cliente procurar (String cpf) throws ClienteNaoExisteException, ClienteInvalidoException {
		if (cpf.length() == 11) {
			if (this.clientes.existe(cpf)) {
				return this.clientes.procurar(cpf);
			} else throw new ClienteNaoExisteException (cpf);
		} else throw new ClienteInvalidoException (cpf);
	}
	public void mudarPlano (String cpf, Integer plano) throws PlanoInvalidoException, ClienteInvalidoException, ClienteNaoExisteException {
		if (cpf.length() == 11) {
			if (plano > 0 && plano < 4) {
				if (this.clientes.existe(cpf)) {
					this.clientes.procurar(cpf).setPlano(plano);
				} else throw new ClienteInvalidoException(cpf);
			} else throw new PlanoInvalidoException(plano);
		} else throw new ClienteInvalidoException (cpf);
	}
}