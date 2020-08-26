package br.com.mgoficina.service;

import br.com.mgoficina.model.Cliente;

public interface IClienteService extends IService<Cliente>{

	public Cliente findClienteByNome(String nome);
}