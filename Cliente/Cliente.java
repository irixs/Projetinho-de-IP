package Cliente;
 
public class Cliente {
    private String CPF;
    private Integer Nivel;
    public Cliente (String cpf) {
        this.CPF = cpf;
        this.Nivel = null;
    }
    public String getCPF() {
        return this.CPF;
    }
    public Integer getNivel() {
            return this.Nivel;
    }
    public void setNivel(Integer nivel) {
            this.Nivel = nivel;
    }
}