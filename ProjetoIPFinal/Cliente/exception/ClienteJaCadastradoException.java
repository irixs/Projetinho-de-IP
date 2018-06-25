package Cliente.exception;
import Cliente.cliente.*;

public class ClienteJaCadastradoException extends Exception {
	public ClienteJaCadastradoException (Cliente cliente) {
		super ("O cliente " + cliente.getCPF() + " j� foi cadastrado no sistema.");
	}
}
