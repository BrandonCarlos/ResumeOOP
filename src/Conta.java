public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo += valor;// this é da Conta de quem chama, abaixo no transfere quem chamou foi a
							// contaDoPaulo
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}

	public boolean transfere(double valor, Conta destino) {
		//if (this.saldo >= valor) {
			//this.saldo -= valor;
		if(this.saca(valor)) {//se for TRUE ai vai depositar
			destino.deposita(valor);//contaDoPaulo.deposita(300), quem chamou foi a contaDoPaulo = this
			return true;			
		}; 
		return false;
}}
