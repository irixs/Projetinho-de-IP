package Cliente;
 
public class ClienteNaoExisteException extends Exception {
    private String cpf;
    public ClienteNaoExisteException (String cpf) {
        super("O cliente" + cpf + "não existe");
        this.cpf = cpf;
    }
}