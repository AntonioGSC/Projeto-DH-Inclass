package br.com.mgoficina.service;

import java.util.List;

public interface IService<T> {

	public T create(T entidade);
	public T findById(long indice);
	public List<T> findAll();
	public boolean update(T entidade);
	public boolean delete(long indice);
}