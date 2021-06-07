package com.asesoftware.turno.gestion_turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.turno.gestion_turnos.entity.ServicioEntity;
import com.asesoftware.turno.gestion_turnos.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService servicioService;
	
	//Listar todos los datos
	@GetMapping(path = "/todos")
	public List<ServicioEntity> obtenerTodo(){
		return servicioService.obtenerTodo();
	}
	
	//Busqueda de elemnto por ID
	@GetMapping(path = "/buscar/{id}")
	public ServicioEntity busquedaId(@PathVariable Integer id){
		return servicioService.busquedaId(id);
	}
	
	//Creación
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ServicioEntity crearServicio(@RequestBody ServicioEntity entity) {
		
		try {
			return servicioService.crearServicio(entity);
		}catch(Exception e) {
			return null;
		}
	}
	
	//Editar
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ServicioEntity editarServicio(@RequestBody ServicioEntity entity) {

		return servicioService.editarServicio(entity);
	}
	
	//Eliminar
	@GetMapping(path = "/eliminar/{id}")
	public void eliminarServicio(@PathVariable Integer id) {
		
		servicioService.eliminarServicio(id);
	}
}
