package com.tolbargy.service;

import java.util.List;

public interface ICrudService<T> {

	public List<T> listarTodos();

	public T listarPorId(int id);

	public void registrar(T entidad);

	public void actualizar(T entidad);

	public void eliminar(int id);

}
