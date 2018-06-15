package Cliente;
 
public class NivelInvalidoException extends Exception {
    public NivelInvalidoException () {
        super ("Nivel inserido invalido./nInsira 1 para o plano de 5% de desconto./nInsira 2 para o plano de 10% de desconto./nInsira 3 para o plano de 15% de desconto.");
    }
}