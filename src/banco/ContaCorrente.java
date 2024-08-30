package banco;

public class ContaCorrente {
	public double saldo;
	public Cliente titular;
	public double chequeEspecial;
	public String agencia;
	public String nrConta;
	public String banco;
	public static int qtdContas;
	
	//construtores
	public ContaCorrente() {
		qtdContas++;
		this.saldo=0.00;
	}
	public ContaCorrente( double chequeEspecial) {
		this();
		this.chequeEspecial=chequeEspecial;
	}
	
	public ContaCorrente(boolean chequeEspecial) {
		if(chequeEspecial) {
			this.chequeEspecial=1000;
		}
	}
	public ContaCorrente(double saldo,double chequeEspecial,String agencia,String nrConta,String banco) {
		this.saldo=saldo;
		this.chequeEspecial=chequeEspecial;
		this.agencia=agencia;
		this.nrConta=nrConta;
		this.banco=banco;
	}
	public ContaCorrente(double saldo,double chequeEspecial,String agencia,String nrConta,String banco,Cliente cliente) {
		this(saldo,chequeEspecial,agencia,nrConta,banco);
		this.titular=cliente;
	}
	
	
	public void depositar(double valor) {
		this.saldo+=valor;
	}
	
	public String exibirSaldo() {
		String saldoFormat;
		 saldoFormat=String.format("Saldo R$ %7.2f",this.saldo);
		 return saldoFormat;
	}
	private boolean verificarSaldo(double valor) {
		return valor <=this.saldo+this.chequeEspecial; 
	
	}
	public boolean sacar(double valorSaque) {
		
		if(verificarSaldo(valorSaque)) {
			this.saldo-=valorSaque;
			return true;
		}
		return false;
		
	}
	public boolean trasferir(double valorTrans, ContaCorrente destino) {
		
		if(verificarSaldo(valorTrans)) {
			this.saldo-=valorTrans;
			destino.saldo+=valorTrans;
			return true;
		}
		return false;
	}
	public static void inicializarContas(ContaCorrente[] contas) {
		for (int i = 0; i < contas.length; i++) {
			contas[i]=new ContaCorrente();
		}
	}
	
	
}
