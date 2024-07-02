
public class Main {

	public static void main(String[] args) {
		Cliente stephanie = new Cliente();
		stephanie.setNome("Stephanie");
		
		Conta cc = new ContaCorrente(stephanie);
		Conta poupanca = new ContaPoupanca(stephanie);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.depositar(200);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

