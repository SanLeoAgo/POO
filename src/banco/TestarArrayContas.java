package banco;

import java.util.Scanner;

public class TestarArrayContas {

	public static void main(String[] args) {
		Cliente[] clientes=null;//variável de referencia
		ContaCorrente[] contas=null;
		double valor;
		int opcao,qtd,num,indiceCliente,indiceConta;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Informe a opção desejada");
			System.out.println("1. Criar contas\n" + "2.Criar clientes\n"+ "3. Associar cliente à conta\n"
			+ "4. Realizar depósito\n"+ "5. Realizar tranferência\n"+ "6. Exibir dados do cliente\n"
					+ "7. Exibir dados da conta\n" + "8. Encerrar");
			opcao=sc.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Quantas contas deseja criar");
				qtd=sc.nextInt();
				contas =new ContaCorrente[qtd];
				ContaCorrente.inicializarContas(contas);
				break;
			case 2:
				System.out.println("Quantas Clientes deseja criar");
				qtd=sc.nextInt();
				clientes =new Cliente[qtd];
				Cliente.inicializarClientes(clientes);
				break;
			case 3:
				System.out.println("Qual é o indice do cliente?");
				indiceCliente=sc.nextInt();
				System.out.println("Qual é o indice da conta?");
				indiceConta=sc.nextInt();
				
				contas[indiceConta].titular=clientes[indiceCliente];
				break;	
			case 4:
				
				break;
			case 5:
			
				break;
				
			case 6:
				System.out.println("Digite o indice do cliente");
				indiceCliente=sc.nextInt();
				System.out.println("Nome: "+clientes[indiceCliente].getNome());
				System.out.println("CPF: "+clientes[indiceCliente].getCpf());
				break;
				
			case 7:
				System.out.println("Digite o indice da Conta");
				indiceConta=sc.nextInt();
				break;
				
			case 8:
				
				break;
			}
		}while(opcao !=8);
		sc.close();
	}

}
