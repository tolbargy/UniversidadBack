package com.tolbargy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tolbargy.modelo.TipoSangre;
import com.tolbargy.service.ITipoSangreService;

@RestController
@RequestMapping("/api/tipo-sangre")
public class TipoSangreRest {

	@Autowired
	private ITipoSangreService service;

	@GetMapping("")
	public List<TipoSangre> listarTodos() {
		return service.listarTodos();
	}

}
