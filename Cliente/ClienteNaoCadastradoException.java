package Cliente;

public class ClienteNaoCadastradoException extends Exception {
	private Cliente cliente;
	public ClienteNaoCadastradoException (Cliente cliente) {
		super("Cliente n�o foi cadastrado no sistema");
	}
}
