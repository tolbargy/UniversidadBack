package com.tolbargy.service;

import java.util.List;

import com.tolbargy.modelo.EnfermedadEstudiante;

public interface IEnfermedadEstudianteService extends ICrudService<EnfermedadEstudiante> {

	public List<EnfermedadEstudiante> listarPorIdEstudiante(int idEstudiante);
}
