package br.com.mgoficina.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
	
	private long id;
	private String nome;
	private String cpf;
	private int idade;
	private char sexo;
	private List<Veiculo> veiculos;
	
	public Cliente(String nome, String cpf, int idade, char sexo, long id) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.id = id;
		this.veiculos = new ArrayList<Veiculo>();
	}

	public List<Veiculo> getVeiculos() {
		return Collections.unmodifiableList(veiculos);
	}

	//Sobrecarga
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = new ArrayList<>(veiculos);
	}
	public void setVeiculos(Veiculo veiculo) {
		this.veiculos.add(veiculo);
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("\n   Id: " + this.getId() + "\n");
		string.append(" Nome: " + this.getNome() + "\n");
		string.append("  CPF: " + this.getCpf() + "\n");
		string.append("Idade: " + this.getIdade() + "\n");
		string.append(" Sexo: " + this.getSexo() + "\n");
		return string.toString();
	}
}
