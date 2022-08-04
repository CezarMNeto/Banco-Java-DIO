package br.banco.conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);

		super.extrato = "---_---_---_--- Extrato ---_---_---_---\n"
				  + "Agência: " + super.agencia + "\n"
			      + "Número da conta: " + super.numero + "\n"
				  + "Tipo da Conta: Conta Corrente\n\n"
				  + "-------------- Histórico --------------\n";
	}

}