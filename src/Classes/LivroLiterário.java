package Classes;

public class LivroLiterário extends Produto{

	public double precoModificado() {
		double preco = getPreco() + (getAno() * 0.001);
		return preco;
	}

}
