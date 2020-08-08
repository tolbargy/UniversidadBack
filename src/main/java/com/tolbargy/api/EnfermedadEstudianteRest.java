package com.tolbargy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("{id}")
	public EnfermedadEstudiante listarPorId(@PathVariable int id) {
		return service.listarPorId(id);
	}

	@PostMapping("")
	public void registrar(@RequestBody EnfermedadEstudiante entidad) {
		service.registrar(entidad);
	}

	@PutMapping("")
	public void actualizar(@RequestBody EnfermedadEstudiante entidad) {
		service.actualizar(entidad);
	}

	@DeleteMapping("{id}")
	public void eliminar(@PathVariable int id) {
		service.eliminar(id);
	}

}
