package br.com.mgoficina.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.service.IServicoService;

public class ServicoServiceImpl implements IServicoService {

	private List<Servico> servicos;
	
	public ServicoServiceImpl() {
		servicos = new ArrayList<Servico>();
	}
	
	public ServicoServiceImpl(List<Servico> servicos) {
		this.servicos = new ArrayList<>(servicos);
	} 
	
	@Override
	public Servico create(Servico servico) throws DataIntegrityException{
		for(Servico _servico : this.servicos) {
			if(_servico.getId() == servico.getId()) {
				throw new DataIntegrityException("IDs Iguais");
			}
		}
		this.servicos.add(servico);
		return servico;
	}

	@Override
	public Servico findById(Long indice) throws ObjectNotFoundException{
		for(Servico servico: this.servicos) {
			if(servico.getId() == indice) {
				return servico;
			}
		}
		throw new ObjectNotFoundException("Ordem de Serviço não encontrada ! ID: " + indice);
	}

	@Override
	public List<Servico> findAll() throws ObjectNotFoundException{
		if(this.servicos.size() == 0) {
			throw new ObjectNotFoundException("Nenhuma Ordem de Serviço cadastrada !");
		}
		return Collections.unmodifiableList(this.servicos);
	}

	@Override
	public boolean update(Servico servico) throws ObjectNotFoundException{
		if(this.servicos.contains(servico)) {
			int indiceDoObjeto = this.servicos.indexOf(servico);
			this.servicos.remove(servico);
			this.servicos.add(indiceDoObjeto, servico);
			return true;
		}else {		
			throw new ObjectNotFoundException("Ordem de Serviço não encontrada ! ID: " + servico.getId());
		}
	}

	@Override
	public boolean delete(Long indice) throws ObjectNotFoundException{
		Servico servico = findById(indice);
		if(servico == null) {
			throw new ObjectNotFoundException("Ordem de Serviço não encontrada ! ID: " + indice);
		}
		else{
			this.servicos.remove(servico);
			return true;
		}
	}

	@Override
	public List<Servico> findServicosByCliente(Long id) throws ObjectNotFoundException{
		List<Servico> findServicos = servicos.stream()
			.filter(servico -> servico.getCliente().getId() == id)
			.collect(Collectors.toList());
		if(findServicos.isEmpty()) {
			throw new ObjectNotFoundException("Nenhuma ordem de Serviço encontrada ! ID: " + id);
		}
		return Collections.unmodifiableList(findServicos);
	}

	@Override
	public List<Servico> findServicosByDatasFinalizadas(LocalDate data) throws ObjectNotFoundException{
		List<Servico> findServicos = servicos.stream()
				.filter(servico -> servico.getDataFim().equals(data))
				.collect(Collectors.toList());
			if(findServicos.isEmpty()) {
				throw new ObjectNotFoundException("Nenhuma ordem de Serviço encontrada ! ID: " + data);
			}
			return Collections.unmodifiableList(findServicos);
	}
}
