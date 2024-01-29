package Programa;


import java.util.Date;


public class Cliente {

	private static int counter = 1;
	
	
	private int numeroPessoa ;
	private String nome;
	private String cpf;
	private String email;

	public Cliente() {
	}
	
	public Cliente(String nome, String cpf, String email) {

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		Cliente.counter += 1;
		
		// dentro do construtor a gente soma esse contador - counter +=1;
		// todas vez que um novo cliente for criado,(um cliente for cadastrar conta)
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	// Esse método retorna uma representação em string de um objeto.
	
	public String toString() {
		return "\nNome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nEmail: " + this.getCpf();
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroPessoa() {
		return numeroPessoa;
	}

	public void setNumeroPessoa(int numeroPessoa) {
		this.numeroPessoa = numeroPessoa;
	}

}