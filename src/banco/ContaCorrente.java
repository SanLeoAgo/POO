package banco;

public class ContaCorrente {
	public double saldo;
	public Cliente titular;
	public double chequeEspecial;
	public String agencia;
	public String nrConta;
	public String banco;
	
	//construtores
	public ContaCorrente() {
		this.chequeEspecial=1000;
		this.saldo=0.00;
	}
	public ContaCorrente( double chequeEspecial,double saldo,Cliente titular) {
		this();
		
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
	
}
