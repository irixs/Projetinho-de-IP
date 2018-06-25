package Venda.exception;

public class VendaNaoEncontradaException extends Exception {
	public VendaNaoEncontradaException (int codigo) {
		super("A Venda "+ codigo + " ainda nao foi registrada");
	}
}