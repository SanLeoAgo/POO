package animal;

public class Cachorro {
	//atributos(estado)
	public String nome;
	public String raca;
	private boolean fome;//está enclapsulado, só pode ser alterado pelo método domir e comer
	public Tutor tutor;
	
	//construtores
	public Cachorro() {
		this.fome=true;
	}
	
	public Cachorro(String nome,String raca) {
		this();//chamar o método da linha 11
		this.nome=nome;
		this.raca=raca;
	}
	
	public Cachorro(String nome,String raca, Tutor tutor) {
		this(nome,raca);//chamar o método da linha 15
		this.tutor=tutor;
	}
	
	//Métodos(comportamento)
	public void latir(int latidos) {
		System.out.println(this.nome +" "+ "Latindo");
		for(int i=0;i<latidos;i++) {
			System.out.println("Au Au");
		}
			
	}
	public void info() {
		System.out.printf("Nome: %s%nRaça: %s", this.nome,this.raca, "%n%s%n");
		//condicao ? valor se v : valor se f
		System.out.println(fome==true? nome+ " Estou com fome": nome + " Não estou com fome");
		
//		if(fome) {
//			System.out.println("");
//			System.out.println("Estou com fome");
//		}else {
//			System.out.println("Não estou com fome");
//		}
//		
	}
	
	public void comer() {
		if(fome) {
			fome=false;
		}
	}
	public void dormir() {
		System.out.println("zzzzzzzzzzzzz");
		this.fome=true;
	}
	private void chorar() {
		System.out.println("uim uim uim uim uim");
	}
	public void morder(Cachorro dog) {
		dog.chorar();
		dog.fome=true;
	}
}
