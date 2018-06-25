package Cliente.exception;

public class ClienteInvalidoException extends Exception {
	private String CPF;
	public ClienteInvalidoException (String cpf) {
		super("O cpf " + cpf + " inserido n�o possui 11 digitos");
		this.CPF = cpf;
	}
}