package Cliente;

public class teste {

	public static void main(String[] args) {
		System.out.println("asdasd");
		RepositorioClienteArray Y = new RepositorioClienteArray(40);
		CadastroClientes X = new CadastroClientes(Y);
		try {
			X.cadastrar(new Cliente ("22222222222"));
			X.mudarPlano("22222222222", 2);
			X.mudarPlano("22222222222", 6);
			X.atualizar(new Cliente ("22222222222"));
		} catch (PlanoInvalidoException a) {
			System.out.println(a.getMessage());
		} catch (ClienteInvalidoException a) {
			System.out.println(a.getMessage());
		} catch (ClienteJaCadastradoException a) {
			System.out.println(a.getMessage());
		} catch (ClienteNaoExisteException a) {
			System.out.println(a.getMessage());
		}  
	}
}
