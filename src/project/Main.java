package project;

public class Main {

	public static void main(String[] args) {
		Cliente Matheus = new Cliente();
		Matheus.setNome("Matheus");
		
		Conta cc = new ContaCorrente(Matheus);
		Conta poupanca = new ContaPoupanca(Matheus);

		cc.depositar(1200);
		cc.transferir(350, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}