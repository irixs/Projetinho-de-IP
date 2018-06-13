package Cliente;
 
public class RepositorioClienteLista implements RepositorioCliente {
    private Cliente cliente;
    private RepositorioClienteLista prox;
    public RepositorioClienteLista () {
        this.cliente = null;
        this.prox = null;
    }
    public void inserir (Cliente cliente) throws RepositorioCheioException {
       
    }
    public void remover (Cliente cliente) {
       
    }
}