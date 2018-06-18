package Cliente;

public class ClienteInvalidoException extends Exception {
	private String CPF;
	public ClienteInvalidoException (String cpf) {
		super("O cpf " + cpf + " inserido não possui 11 digitos");
		this.CPF = cpf;
	}
}