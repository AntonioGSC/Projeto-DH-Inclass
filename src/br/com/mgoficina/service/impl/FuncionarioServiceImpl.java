package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Funcionario;
import br.com.mgoficina.service.IFuncionarioService;

public class FuncionarioServiceImpl implements IFuncionarioService {

	private List<Funcionario> funcionarios;
	
	public FuncionarioServiceImpl() {
		funcionarios = new ArrayList<Funcionario>();
	}
	
	public FuncionarioServiceImpl(List<Funcionario> funcionarios) {
		this.funcionarios = new ArrayList<>(funcionarios);
	} 
	
	@Override
	public Funcionario create(Funcionario funcionario) throws DataIntegrityException{
		if(funcionario.getIdade() < 18 && funcionario.getIdade() >= 150) {
			throw new DataIntegrityException("Idade Inválida");
		}
		for(Funcionario _funcionario : this.funcionarios) {
			if(_funcionario.getId() == funcionario.getId()) {
				throw new DataIntegrityException("IDs Iguais");
			}
		}
		this.funcionarios.add(funcionario);
		return funcionario;
	}

	@Override
	public Funcionario findById(Long indice) throws ObjectNotFoundException{
		for(Funcionario funcionario: this.funcionarios) {
			if(funcionario.getId() == indice) {
				return funcionario;
			}
		}
		throw new ObjectNotFoundException("Funcionario não encontrado ! ID: " + indice);
	}

	@Override
	public List<Funcionario> findFuncionarioByNome(String nome) throws ObjectNotFoundException{
		List<Funcionario> findNomes = this.funcionarios.parallelStream()
				.filter(funcionario -> funcionario.getNome().equals(nome))
				.collect(Collectors.toList());
		
		if(findNomes.isEmpty()) {
			throw new ObjectNotFoundException("Funcionario não encontrado ! Modelo: " + nome);
		}
		return Collections.unmodifiableList(findNomes);
	}

	@Override
	public List<Funcionario> findAll() throws ObjectNotFoundException{
		if(this.funcionarios.size() == 0) {
			throw new ObjectNotFoundException("Nenhum funcionario cadastrado !");
		}
		return Collections.unmodifiableList(this.funcionarios);
	}

	@Override
	public boolean update(Funcionario funcionario) throws ObjectNotFoundException{
		if(this.funcionarios.contains(funcionario)) {
			int indiceDoObjeto = this.funcionarios.indexOf(funcionario);
			this.funcionarios.remove(funcionario);
			this.funcionarios.add(indiceDoObjeto, funcionario);
			return true;
		}else {		
			throw new ObjectNotFoundException("Funcionario não encontrado ! ID: " + funcionario.getId());
		}
	}

	@Override
	public boolean delete(Long indice) throws ObjectNotFoundException{
		Funcionario funcionario = findById(indice);
		if(funcionario == null) {
			throw new ObjectNotFoundException("Funcionario não encontrado ! ID: " + indice);
		}
		else{
			this.funcionarios.remove(funcionario);
			return true;
		}
	}
}
