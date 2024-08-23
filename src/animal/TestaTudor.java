package animal;

public class TestaTudor {

	public static void main(String[] args) {
		//criando um construtor anonimo
		new Cachorro("Totó","Sem raça").latir(50);
		
		//Criar tutor
		Tutor tutor=new Tutor();
		tutor.nome="Chile";
		tutor.tel="11-99999-8888";
		tutor.endereco="Rua Teste, 10";
		
		//Criar cachorro
		Cachorro dog1= new Cachorro();
		dog1.nome= "Rex";
		dog1.raca="Vira-Lata";
		dog1.tutor =tutor;
		System.out.println(dog1.tutor.nome);
		
		Cachorro dog2=new Cachorro();
		dog2.nome="Lulu";
		dog2.raca="Poodle";
		dog2.tutor =tutor;
		
		dog2.tutor.nome="Anderson";
		System.out.println(dog1.tutor.nome);
		System.out.println(dog2.tutor.nome);
		System.out.println(tutor.nome);
		
		Cachorro dog3=new Cachorro("Lili","Vira-lata",tutor);
	}

}
