package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.mgoficina.exception.DataIntegrityException;
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
	public Cliente create(Cliente cliente) throws DataIntegrityException{
		if(cliente.getIdade() < 18 && cliente.getIdade() >= 150) {
			throw new DataIntegrityException("Idade Inválida");
		}
		for(Cliente _cliente : this.clientes) {
			if(_cliente.getId() == cliente.getId()) {
				throw new DataIntegrityException("IDs Iguais");
			}
		}
		this.clientes.add(cliente);
		return cliente;
	}

	@Override
	public Cliente findById(Long indice) throws ObjectNotFoundException{
		for(Cliente cliente: this.clientes) {
			if(cliente.getId() == indice) {
				return cliente;
			}
		}
		throw new ObjectNotFoundException("Cliente não encontrado ! ID: " + indice);
	}

	@Override
	public List<Cliente> findClienteByNome(String nome) throws ObjectNotFoundException{
		List<Cliente> findNomes = this.clientes.parallelStream()
				.filter(cliente -> cliente.getNome().equals(nome))
				.collect(Collectors.toList());
		
		if(findNomes.isEmpty()) {
			throw new ObjectNotFoundException("Cliente não encontrado ! Modelo: " + nome);
		}
		return Collections.unmodifiableList(findNomes);
	}

	@Override
	public List<Cliente> findAll() throws ObjectNotFoundException{
		if(this.clientes.size() == 0) {
			throw new ObjectNotFoundException("Nenhum cliente cadastrado !");
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
	public boolean delete(Long indice) throws ObjectNotFoundException{
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
