package com.asesoftware.turno.gestion_turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.turno.gestion_turnos.entity.ComercioEntity;
import com.asesoftware.turno.gestion_turnos.entity.ServicioEntity;
import com.asesoftware.turno.gestion_turnos.service.IComercioService;

@RestController
@RequestMapping(path = "/api/v1/comercio")
public class ComercioController {
	
	@Autowired
	private IComercioService comercioService;
	
	//Listar todos los datos
	@GetMapping(path = "/todos")
	public List<ComercioEntity> obtenerTodo(){
		return comercioService.obtenerTodo();
	}
	
	//Busqueda de elemnto por ID
	@GetMapping(path = "/buscar/{id}")
	public ComercioEntity busquedaId(@PathVariable Integer id){
		return comercioService.busquedaId(id);
	}
	
	//Creación
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ComercioEntity crearComercio(@RequestBody ComercioEntity entity) {
		try {
			return comercioService.crearComercio(entity);
		}catch(Exception e) {
			return null;
		}
	}
}
