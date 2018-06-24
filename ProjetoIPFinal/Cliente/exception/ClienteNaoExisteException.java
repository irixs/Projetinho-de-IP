package Cliente.exception;
 
public class ClienteNaoExisteException extends Exception {
    public ClienteNaoExisteException (String cpf) {
        super("O cliente " + cpf + " n�o esta cadastrado no sistema");
    }
}