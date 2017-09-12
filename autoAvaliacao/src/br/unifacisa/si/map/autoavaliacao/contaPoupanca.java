package br.unifacisa.si.map.autoavaliacao;

public class contaPoupanca extends contaBancaria{

	private double rendimento;
	
	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public contaPoupanca(String cpf) {
		super(cpf);
	}
	
}
