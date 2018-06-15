package Cliente;

public class ClienteNaoCadastradoException extends Exception {
	private Cliente cliente;
	public ClienteNaoCadastradoException (Cliente cliente) {
		super("Cliente não foi cadastrado no sistema");
	}
}
