package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.model.Cliente;

public interface IClienteService extends IService<Cliente>{

	public List<Cliente> findClienteByNome(String nome);
}