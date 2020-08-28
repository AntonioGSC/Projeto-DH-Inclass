package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.model.Veiculo;

public interface IVeiculoService extends IService<Veiculo>{

	public List<Veiculo> findVeiculoByModelo(String nome);
	public Veiculo findVeiculoByPlaca(String placa);
}
