package com.tolbargy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tolbargy.modelo.TipoSangre;
import com.tolbargy.repository.ITipoSangreRepository;
import com.tolbargy.service.ITipoSangreService;

@Service
public class TipoSangreServiceImpl implements ITipoSangreService {

	@Autowired
	private ITipoSangreRepository repo;

	@Override
	public List<TipoSangre> listarTodos() {
		return repo.findAll();
	}

	@Override
	public TipoSangre listarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(TipoSangre entidad) {
		repo.save(entidad);
	}

	@Override
	public void actualizar(TipoSangre entidad) {
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}

}
