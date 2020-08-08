package com.tolbargy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tolbargy.modelo.Estudiante;
import com.tolbargy.repository.IEstudianteRepository;
import com.tolbargy.service.IEstudianteService;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepository repo;

	@Override
	public List<Estudiante> listarTodos() {
		return repo.findAll();
	}

	@Override
	public Estudiante listarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void registrar(Estudiante entidad) {
		repo.save(entidad);
	}

	@Override
	public void actualizar(Estudiante entidad) {
		repo.save(entidad);
	}

	@Override
	public void eliminar(int id) {
		repo.deleteById(id);
	}

}
