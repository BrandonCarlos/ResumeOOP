public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta .saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		
		System.out.println("Na primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Na segunda conta tem: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta est? na agencia: " + segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("S?o a mesma conta");
		} else {
			System.out.println("N?o s?o a mesma conta");
		} 
		
	}
}
