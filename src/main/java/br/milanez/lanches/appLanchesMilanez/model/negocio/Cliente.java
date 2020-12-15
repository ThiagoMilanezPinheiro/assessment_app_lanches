package br.milanez.lanches.appLanchesMilanez.model.negocio;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	
	
// Criação do construtor	
	
	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	
	}
	
// Criação do ToString utilizando o StringBuilder
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getCpf());
		sb.append(";");
		sb.append(this.getEmail());
		
		return sb.toString();
	}
	

// Metodos getters
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	

}
