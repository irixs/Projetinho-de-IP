package Cliente;
 
public class NivelNaoDefinidoException extends Exception {
    private String CPF;
    public NivelNaoDefinidoException (String cpf) {
        super ("Nivel n�o definido para o cliente" + cpf);
        this.CPF = cpf;
    }
}