package Cliente;

public class ClienteJaCadastradoException extends Exception {
	private Cliente cliente;
	public ClienteJaCadastradoException (Cliente cliente) {
		super ("O cliente já foi cadastrado no sistema.");
		this.cliente = cliente;
	}
}
