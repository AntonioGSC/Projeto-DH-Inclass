package br.com.mgoficina.model;

public class Cliente {
	
	private int id;
	private String nome;
	private String cpf;
	private int idade;
	private char sexo;
	
	public Cliente(String nome, String cpf, int idade, char sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.id++;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + id;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + sexo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id != other.id)
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("   Id: " + this.getId() + "\n");
		string.append(" Nome: " + this.getNome() + "\n");
		string.append("  CPF: " + this.getCpf() + "\n");
		string.append("Idade: " + this.getIdade() + "\n");
		string.append(" Sexo: " + this.getSexo() + "\n");
		return string.toString();
	}
}
