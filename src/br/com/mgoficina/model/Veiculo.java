package br.com.mgoficina.model;

public class Veiculo {

	private long id;
	private String placa;
	private String modelo;
	private int ano;
	private String cor;
	private String chassi;
	private String tipoVeiculo;
	
	public Veiculo(String placa, String modelo, int ano, String cor, String chassi, String tipoVeiculo, long id) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.chassi = chassi;
		this.tipoVeiculo = tipoVeiculo;
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
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
		Veiculo other = (Veiculo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("\n    Id: " + this.getId() + "\n");
		string.append("  Tipo: " + this.getTipoVeiculo() + "\n");
		string.append("Modelo: " + this.getModelo() + "\n");
		string.append("   Ano: " + this.getAno() + "\n");
		string.append("   Cor: " + this.getCor() + "\n");
		string.append(" Placa: " + this.getPlaca() + "\n");
		string.append("Chassi: " + this.getChassi() + "\n");
		return string.toString();
	}
}
