package com.asesoftware.turno.gestion_turnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.turno.gestion_turnos.dto.ResponseDTO;
import com.asesoftware.turno.gestion_turnos.dto.ServicioDTO;
import com.asesoftware.turno.gestion_turnos.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService servicioService;
	
	//Listar todos los datos
	@GetMapping(path = "/todos")
	public ResponseDTO obtenerTodo(){
		return servicioService.obtenerTodo();
	}
	
	//Busqueda de elemnto por ID
	@GetMapping(path = "/buscar/{id}")
	public ResponseDTO busquedaId(@PathVariable Integer id){
		return servicioService.busquedaId(id);
	}
	
	//Creación
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ResponseDTO crearServicio(@RequestBody ServicioDTO servicioDto) {

			return servicioService.crearServicio(servicioDto);
	}
	
	//Editar
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ResponseDTO editarServicio(@RequestBody ServicioDTO servicioDto) {

		return servicioService.editarServicio(servicioDto);
	}
	
	//Eliminar
	@GetMapping(path = "/eliminar/{id}")
	public ResponseDTO eliminarServicio(@PathVariable Integer id) {
		
		return servicioService.eliminarServicio(id);
	}
	
}
