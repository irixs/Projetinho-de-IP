package Cliente.exception;

public class PlanoInvalidoException extends Exception {
	public PlanoInvalidoException (String cpf) {
		super ("O plano inserido para o cpf " + cpf + " é invalido.\nSelecione 1 para o plano de 5% de desconto.\nSelecione 2 para o plano de 10% de desconto.\nSelecione 3 para o plano de 15% de desconto.");
	}
}