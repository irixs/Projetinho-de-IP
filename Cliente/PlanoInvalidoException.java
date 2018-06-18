package Cliente;

public class PlanoInvalidoException extends Exception {
	private Integer Plano;
	public PlanoInvalidoException (Integer plano) {
		super ("O plano inserido é invalido.\nSelecione 1 para adquirir o plano de 5% de desconto.\nSelecione 2 para adquirir o plano de 10% de desconto.\nSelecione 3 para adquirir o plano de 15% de desconto.");
		this.Plano = plano;
	}
}