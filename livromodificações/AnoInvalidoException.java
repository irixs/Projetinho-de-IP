package livromodificações;
 
public class AnoInvalidoException extends Exception {
	public AnoInvalidoException () {
		super ("Ano de edição invalido, insira um ano entre 1900 e 2018");
	}
}
