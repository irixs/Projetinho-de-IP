package Cliente;
 
public class ClienteNaoExisteException extends Exception {
    private Cliente cliente;
    public ClienteNaoExisteException (Cliente cliente) {
        super("O cliente" + cliente.getCPF() + "não existe");
        this.cliente = cliente;
    }
}