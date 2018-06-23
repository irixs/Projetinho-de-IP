package Classes;

public class LivroAcademico extends Produto {

	public double precoModificado() {
		double preco = getPreco() - ((2018 - getAno())*0.25);
		if (preco < 5) {
			preco = 5;
		}
		return preco;
	}

}
