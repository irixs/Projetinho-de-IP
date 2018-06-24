package Cliente.exception;
 
public class ClienteNaoExisteException extends Exception {
    public ClienteNaoExisteException (String cpf) {
        super("O cliente " + cpf + " não esta cadastrado no sistema");
    }
}