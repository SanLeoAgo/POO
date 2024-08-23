package banco;

public class TestarBanco {

	public static void main(String[] args) {
		Cliente c1 =new Cliente();
		c1.nome="Chile";
		c1.cpf="111.222.333-44";
		
		ContaCorrente cont1=new ContaCorrente();
		cont1.nrConta="1234-5";
		cont1.agencia="444";
		cont1.titular=c1;
		
		ContaCorrente cont2=new ContaCorrente();
		cont2.nrConta="1234-5";
		cont2.agencia="444";
		cont2.titular=c1;
		
		c1.nome="Carlos";
		c1=null;
		System.out.println(cont1.titular.nome);
		System.out.println(cont2.titular.nome);
		
		
		

	}

}
