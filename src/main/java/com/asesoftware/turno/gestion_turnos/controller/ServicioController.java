package com.asesoftware.turno.gestion_turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping(path = "/{id}")
	public ServicioEntity busquedaId(@PathVariable Integer id){
		return servicioService.busquedaId(id);
	}

}
