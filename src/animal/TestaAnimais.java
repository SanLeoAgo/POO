package animal;

public class TestaAnimais {
	public static void main(String[] args) {
		//criando um cachorro
		Cachorro dog1= new Cachorro();
		dog1.nome= "Rex";
		dog1.raca="Labrador";
		dog1.latir(10);
		dog1.comer();
		dog1.info();
		
		
		//System.out.printf("Nome: %s%nRaça: %s", dog1.nome,dog1.raca,"%s");
		Cachorro dog2=new Cachorro();
		dog2.nome="Lulu";
		dog2.raca="Poodle";
		dog2.latir(5);
		dog2.dormir();
		dog2.info();
		
		System.out.println("Mordida");
		dog1.info();
		dog2.morder(dog1);
		dog1.info();
		//System.out.printf("Nome: %s%nRaça: %s", dog2.nome,dog2.raca,"%s");
		
	}

}
