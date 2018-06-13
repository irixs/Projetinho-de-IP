package Cliente;
 
public class RepositorioCheioException extends Exception {
    private Cliente cliente;
    public RepositorioCheioException (Cliente cliente) {
        super ("O cliente" + cliente.getCPF() +"n�o pois o limite de cadastros foi atingido.");
        this.cliente = cliente;
    }
}