package br.com.mgoficina.model;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private int idade;
	private char sexo;
	private String cargo;
	private Long id;
	private String login;
	
	public Funcionario(String nome, String cpf, int idade, char sexo, String cargo, Long id, String login) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.cargo = cargo;
		this.id = id;
		this.login = login;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
