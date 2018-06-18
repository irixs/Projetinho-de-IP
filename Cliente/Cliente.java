package Cliente;

public class Cliente {
	private String CPF;
	private Integer Plano;
	public Cliente (String cpf) {
		this.CPF = cpf;
		this.Plano = null;
	}
	public String getCPF() {
		return this.CPF;
	}
	public Integer getPlano() {
		return this.Plano;
	}
	public void setPlano(Integer plano) {
		this.Plano = plano;
	}
}