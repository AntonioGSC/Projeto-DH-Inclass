package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.service.IClienteService;

public class ClienteServiceImpl implements IClienteService{

	private List<Cliente> clientes;
	
	public ClienteServiceImpl() {
		clientes = new ArrayList<Cliente>();
	}
	public ClienteServiceImpl(List<Cliente> clientes) {
		this.clientes = new ArrayList<>(clientes);
	} 
	
	@Override
	public Cliente create(Cliente cliente) {
		this.clientes.add(cliente);
		return cliente;
	}

	@Override
	public Cliente findClienteById(long indice) throws ObjectNotFoundException{
		for(Cliente cliente: this.clientes) {
			if(cliente.getId() == indice) {
				return cliente;
			}
			else {
				throw new ObjectNotFoundException("Cliente não encontrado !");
			}
		}
		return null;
	}

	@Override
	public Cliente findClienteByNome(String nome) throws ObjectNotFoundException{		
		for(Cliente cliente: this.clientes) {
			if(cliente.getNome().equals(nome)) {
				return cliente;
			}
			else {
				throw new ObjectNotFoundException("Cliente não encontrado !");
			}
		}
		return null;
	}

	@Override
	public List<Cliente> findAll() {
		return Collections.unmodifiableList(this.clientes);
	}

	@Override
	public boolean updateCliente(Cliente cliente) {
		if(this.clientes.contains(cliente)) {
			int indiceDoObjeto = this.clientes.indexOf(cliente);
			this.clientes.remove(cliente);
			this.clientes.add(indiceDoObjeto, cliente);
			return true;
		}else {		
			return false;
		}
	}

	@Override
	public boolean deleteCliente(long indice) throws ObjectNotFoundException{
		Cliente cliente = findClienteById(indice);
		if(cliente == null) {
			throw new ObjectNotFoundException("Cliente não encontrado !");
		}
		else{
			this.clientes.remove(cliente);
			return true;
		}
	}
}
