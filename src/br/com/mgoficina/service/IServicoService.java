package br.com.mgoficina.service;

import java.time.LocalDate;
import java.util.List;

import br.com.mgoficina.model.Servico;

public interface IServicoService extends IService<Servico>{

	public List<Servico> findServicosByCliente(Long id);
	public List<Servico> findServicosByDatasFinalizadas(LocalDate data);
}
