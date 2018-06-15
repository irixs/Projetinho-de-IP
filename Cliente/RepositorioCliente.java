package Cliente;
 
public interface RepositorioCliente {
    void inserir (Cliente cliente);
    void remover (Cliente cliente);
    Cliente procurar (String cpf);
    void atualizar (Cliente cliente);
    boolean existe (String cpf);
}