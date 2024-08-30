package banco;

public class TestarConstrutorContas {

	public static void main(String[] args) {
		ContaCorrente conta=new ContaCorrente(0,100,"1234","8888-8","Itaú",new Cliente("Carlos","222.222.222-22"));
		
		ContaCorrente conta2=new ContaCorrente();
		ContaCorrente conta3=new ContaCorrente();
		ContaCorrente conta4=new ContaCorrente();
		
		System.out.println(ContaCorrente.qtdContas);
		System.out.println(conta2.qtdContas);
		System.out.println(conta3.qtdContas);
	}

}
