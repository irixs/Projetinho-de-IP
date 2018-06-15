package Cliente;
 
public class CPFInvalidoException extends Exception{
    private String CPF;
    public CPFInvalidoException (String cpf) {
        super ("O CPF" + cpf + "é invalido");
        this.CPF = cpf;
    }
}