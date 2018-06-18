package Cliente;

public class ClienteJaCadastradoException extends Exception {
	private Cliente cliente;
	public ClienteJaCadastradoException (Cliente cliente) {
		super ("O cliente j� foi cadastrado no sistema.");
		this.cliente = cliente;
	}
}
