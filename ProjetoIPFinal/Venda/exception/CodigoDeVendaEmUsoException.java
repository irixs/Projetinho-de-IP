package Venda.exception;

public class CodigoDeVendaEmUsoException extends Exception {
	public CodigoDeVendaEmUsoException (int codigo) {
		super("O codigo de venda " + codigo + " ja foi registrado.");
	}
}
