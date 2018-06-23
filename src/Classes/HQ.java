package Classes;

public class HQ extends Produto {
	private double raridade = (2018 - getAno()) / 3;

	public double precoModificado() {
		double preco = getPreco() + (raridade*2.5);
		return preco;
	}

}
