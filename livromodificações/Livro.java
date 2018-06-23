package livromodificações;

public abstract class Livro {
	private String titulo;
	private int ano;
	private Double preco;
	
	Livro (String titulo, int ano) throws AnoInvalidoException {
		if (ano < 1900 || ano > 2018) {
			this.titulo = titulo;
			this.ano = ano;
		} else throw new AnoInvalidoException();
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public int getAno() {
		return this.ano;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public abstract void calcularPreco(int ano);
}