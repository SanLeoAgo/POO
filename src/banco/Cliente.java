package banco;

public class Cliente {
	
	public String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String cpf;
	
	public Cliente() {
		
	}
		
		public Cliente (String nome, String cpf) { 
			this.nome=nome;
			this.cpf=cpf;
		
	}
		public static void inicializarClientes(Cliente[] clientes) {
			for (int i = 0; i < clientes.length; i++) {
				clientes[i]=new Cliente();
			}
		}
	
  }

