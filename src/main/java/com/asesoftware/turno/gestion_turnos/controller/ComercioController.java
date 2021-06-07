package com.asesoftware.turno.gestion_turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
