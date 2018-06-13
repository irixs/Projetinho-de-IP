package Cliente;
 
public class CPFInvalidoException extends Exception{
    private String CPF;
    public CPFInvalidoException (String cpf) {
        super ("O CPF" + cpf + "� invalido");
        this.CPF = cpf;
    }
}