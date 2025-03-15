
public class Main {

	public static void main(String[] args) {
		Cliente newCliente = new Cliente();
		newCliente.setNome("Amanda");
		
		Conta cc = new ContaCorrente(newCliente);
		Conta poupanca = new ContaPoupanca(newCliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
