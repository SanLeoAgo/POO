package banco;

public class TestarContas {
	public static void main(String[] args) {
		ContaCorrente c1=new ContaCorrente();
		c1.banco="Itaú";
		c1.agencia="0755";
		c1.nrConta="1234-5";
		c1.titular="Ana Maria";
		ContaCorrente c2=new ContaCorrente();
		c2.banco="Bradesco";
		c2.agencia="0756";
		c2.nrConta="5678-9";
		c2.titular="Anabelle Maria";
		c2.depositar(200);
		
		System.out.println(c1.exibirSaldo());
		if(c1.sacar(200)) {
			System.out.println("Saque realizado com sucesso");
			System.out.println(c1.exibirSaldo());
		}else {
			System.out.println("Não foi possível realizar o saque");
			
		}
		System.out.println(c1.exibirSaldo());
		System.out.println(c2.exibirSaldo());
		c1.trasferir(200, c2);
		System.out.println(c1.exibirSaldo());
		System.out.println(c2.exibirSaldo());
		
	}

}
