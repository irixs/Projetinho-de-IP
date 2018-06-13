package Cliente;
 
public class RepositorioClienteArray implements RepositorioCliente {
    private Cliente[] clientes;
    private int Indice;
    public RepositorioClienteArray (int tam) {
        clientes = new Cliente[tam];
        this.Indice = 0;
    }
    public void inserir (Cliente cliente) throws RepositorioCheioException {
        if (this.Indice != clientes.length) {
            clientes[this.Indice] = cliente;
            this.Indice++;
        } else throw new RepositorioCheioException(cliente);
    }
    public void remorer (Cliente cliente) throws ClienteNaoExisteException {
        if (procurar(cliente.getCPF()) != null) {
            boolean removeu = false;
            for (int b = 0; b < this.Indice; b++) {
                if (clientes[b].getCPF().equals(cliente.getCPF())) {
                    clientes[b] = null;
                    removeu = true;
                }
                if (removeu) {
                    if (b < this.Indice - 1) {
                        clientes[b] = clientes[b + 1];
                    }
                }
            }
            this.Indice--;
        } else throw new ClienteNaoExisteException(cliente);
    }
    public Cliente procurar (String cpf) {
        for (int a = 0; a < this.Indice; a++) {
            if (clientes[a].getCPF().equals(cpf)) {
                return clientes[a];
            }
        }
        return null;
    }
    public void atualizar (Cliente cliente) throws ClienteNaoExisteException {
        if (procurar(cliente.getCPF()) != null) {
            for (int a = 0; a < this.Indice; a++) {
                if (clientes[a].getCPF().equals(cliente.getCPF())) {
                    clientes[a] = cliente;
                }
            }
        } else throw new ClienteNaoExisteException(cliente);
    }
}