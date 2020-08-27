package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.mgoficina.exception.NoDataException;
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
	public Cliente findById(long indice) throws ObjectNotFoundException{
		for(Cliente cliente: this.clientes) {
			if(cliente.getId() == indice) {
				return cliente;
			}
		}
		throw new ObjectNotFoundException("Cliente não encontrado ! ID: " + indice);
	}

	@Override
	public Cliente findClienteByNome(String nome) throws ObjectNotFoundException{
		return this.clientes.stream()
						.filter(cliente -> cliente.getNome().equals(nome))
						.findAny()
						.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado ! Nome: " + nome));
	}

	@Override
	public List<Cliente> findAll() throws NoDataException{
		if(this.clientes.size() == 0) {
			throw new NoDataException("Nenhum cliente cadastrado !");
		}
		return Collections.unmodifiableList(this.clientes);
	}

	@Override
	public boolean update(Cliente cliente) throws ObjectNotFoundException{
		if(this.clientes.contains(cliente)) {
			int indiceDoObjeto = this.clientes.indexOf(cliente);
			this.clientes.remove(cliente);
			this.clientes.add(indiceDoObjeto, cliente);
			return true;
		}else {		
			throw new ObjectNotFoundException("Cliente não encontrado ! ID: " + cliente.getId());
		}
	}

	@Override
	public boolean delete(long indice) throws ObjectNotFoundException{
		Cliente cliente = findById(indice);
		if(cliente == null) {
			throw new ObjectNotFoundException("Cliente não encontrado ! ID: " + indice);
		}
		else{
			this.clientes.remove(cliente);
			return true;
		}
	}
}
