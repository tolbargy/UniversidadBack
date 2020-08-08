package com.tolbargy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolbargy.modelo.TipoIdentificacion;
import com.tolbargy.service.ITipoIdentificacionService;

@RestController
@RequestMapping("/api/tipo-identificacion")
public class TipoIdentificacionRest {

	@Autowired
	private ITipoIdentificacionService service;

	@GetMapping("/listarTodos")
	public List<TipoIdentificacion> listarTodos() {
		return service.listarTodos();
	}

}
