package br.unifacisa.si.map.autoavaliacao;


public class contaCorrente extends contaBancaria {

	private double chequeEspecial;
	
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}


	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}


	public contaCorrente(String cpf) {
		super(cpf);
		
	}

}
