
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(conseguiuRetirar);
		System.out.println(contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		if(sucessoTransferencia) {//contaDoPaulo é a referência(aquele código alocado na memória)
			System.out.println("Transferencia com sucesso.");
		} else {
			System.out.println("Faltou dinheiro.");
		}
		System.out.println("Saldo da Marcela atualmente: " + contaDaMarcela.saldo);
		System.out.println("Saldo do Paulo atualmente: " + contaDoPaulo.saldo);
	}
}
