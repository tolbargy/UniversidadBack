package com.tolbargy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolbargy.modelo.EnfermedadEstudiante;
import com.tolbargy.service.IEnfermedadEstudianteService;

@RestController
@RequestMapping("/api/enfermedad-estudiante")
public class EnfermedadEstudianteRest {

	@Autowired
	private IEnfermedadEstudianteService service;

	@GetMapping("")
	public List<EnfermedadEstudiante> listarTodos() {
		return service.listarTodos();
	}

}
