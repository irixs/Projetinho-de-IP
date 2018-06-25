package Cliente.cliente;

import Cliente.exception.ClienteInvalidoException;

public class Cliente {
	private String CPF;
	private Integer Plano;
	public Cliente (String cpf) throws ClienteInvalidoException {
		if (cpf.length() == 11) {
			this.CPF = cpf;
			this.Plano = null;
		} else throw new ClienteInvalidoException (cpf);
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