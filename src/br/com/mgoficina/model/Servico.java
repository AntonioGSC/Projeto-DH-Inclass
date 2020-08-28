package br.com.mgoficina.model;

import java.time.LocalDate;

public class Servico {
	
	private Long id;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private double valor;
	private String metodoPagamento;
	private Cliente cliente;
	private Veiculo veiculo;
	
	public Servico(Long id, LocalDate dataInicio, LocalDate dataFim, double valor, String metodoPagamento,
			Cliente cliente, Veiculo veiculo) {
		this.id = id;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.valor = valor;
		this.metodoPagamento = metodoPagamento;
		this.cliente = cliente;
		this.veiculo = veiculo;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
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
		Servico other = (Servico) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("\n        ORDEM DE SERVIÇO");
		string.append("\n             Id: " + this.getId() + "\n");
		string.append("     DataInicio: " + this.getDataInicio() + "\n");
		string.append("        DataFim: " + this.getDataFim() + "\n");
		string.append("          Valor: " + this.getValor() + "\n");
		string.append("MetodoPagamento: " + this.getMetodoPagamento() + "\n\n");
		string.append("        Cliente: " + this.getCliente() + "\n");
		string.append("        Veiculo: " + this.getVeiculo() + "\n");
		return string.toString();
	}
}
