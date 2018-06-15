package Cliente;
 
public class NivelNaoDefinidoException extends Exception {
    private String CPF;
    public NivelNaoDefinidoException (String cpf) {
        super ("Nivel não definido para o cliente" + cpf);
        this.CPF = cpf;
    }
}