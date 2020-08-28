package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.mgoficina.exception.DataIntegrityException;
import br.com.mgoficina.exception.ObjectNotFoundException;
import br.com.mgoficina.model.Veiculo;
import br.com.mgoficina.service.IVeiculoService;

public class VeiculoServiceImpl implements IVeiculoService {

	private List<Veiculo> veiculos;
	
	public VeiculoServiceImpl() {
		veiculos = new ArrayList<Veiculo>();
	}
	
	public VeiculoServiceImpl(List<Veiculo> veiculos) {
		this.veiculos = new ArrayList<>(veiculos);
	} 
	
	@Override
	public Veiculo create(Veiculo veiculo) throws DataIntegrityException{
		for(Veiculo _veiculo : this.veiculos) {
			if(_veiculo.getId() == veiculo.getId()) {
				throw new DataIntegrityException("IDs Iguais");
			}
		}
		this.veiculos.add(veiculo);
		return veiculo;
	}

	@Override
	public Veiculo findById(Long indice) throws ObjectNotFoundException{
		for(Veiculo veiculo: this.veiculos) {
			if(veiculo.getId() == indice) {
				return veiculo;
			}
		}
		throw new ObjectNotFoundException("Veiculo não encontrado ! ID: " + indice);
	}

	@Override
	public List<Veiculo> findAll() throws ObjectNotFoundException{
		if(this.veiculos.size() == 0) {
			throw new ObjectNotFoundException("Nenhum Veiculo cadastrado !");
		}
		return Collections.unmodifiableList(this.veiculos);
	}

	@Override
	public boolean update(Veiculo veiculo) throws ObjectNotFoundException{
		if(this.veiculos.contains(veiculo)) {
			int indiceDoObjeto = this.veiculos.indexOf(veiculo);
			this.veiculos.remove(veiculo);
			this.veiculos.add(indiceDoObjeto, veiculo);
			return true;
		}else {		
			throw new ObjectNotFoundException("Veiculo não encontrado ! ID: " + veiculo.getId());
		}
	}

	@Override
	public boolean delete(Long indice) throws ObjectNotFoundException{
		Veiculo veiculo = findById(indice);
		if(veiculo == null) {
			throw new ObjectNotFoundException("Veiculo não encontrado ! ID: " + indice);
		}
		else{
			this.veiculos.remove(veiculo);
			return true;
		}
	}

	@Override
	public List<Veiculo> findVeiculoByModelo(String modelo) throws ObjectNotFoundException{
		List<Veiculo> findModelos = this.veiculos.parallelStream()
				.filter(veiculo -> veiculo.getModelo().equals(modelo))
				.collect(Collectors.toList());
		if(findModelos.isEmpty()) {
			throw new ObjectNotFoundException("Veiculo não encontrado ! Modelo: " + modelo);
		}
		return Collections.unmodifiableList(findModelos);
	}

	@Override
	public Veiculo findVeiculoByPlaca(String placa) throws ObjectNotFoundException{
		return this.veiculos.parallelStream()
				.filter(veiculo -> veiculo.getPlaca().equals(placa))
				.findAny()
				.orElseThrow(() -> new ObjectNotFoundException("Veiculo não encontrado ! Placa: " + placa));
	}
}
