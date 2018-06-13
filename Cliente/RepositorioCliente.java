package Cliente;
 
public interface RepositorioCliente {
    void inserir (Cliente cliente) throws RepositorioCheioException;
    void remorer (Cliente cliente) throws ClienteNaoExisteException;
    Cliente procurar (String cpf);
    void atualizar (Cliente cliente) throws ClienteNaoExisteException;
}