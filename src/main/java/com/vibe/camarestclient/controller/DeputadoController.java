package com.vibe.camarestclient.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vibe.camarestclient.model.Deputado;
import com.vibe.camarestclient.service.DeputadoService;


@RestController
public class DeputadoController {
	@Autowired
	private DeputadoService deputadoService;

	@GetMapping(path ="/deputados", produces=MediaType.APPLICATION_JSON_VALUE)
	public  ResponseEntity<List<Deputado>> getAllDeputados() {
		List<Deputado> response = this.deputadoService.getAll();
		return ResponseEntity.ok(response);
	}
}
