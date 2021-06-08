package com.asesoftware.turno.gestion_turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.turno.gestion_turnos.entity.TurnosEntity;
import com.asesoftware.turno.gestion_turnos.service.ITurnosService;

@RestController
@RequestMapping(path = "api/v1/turnos")
public class TurnosController {
	
	@Autowired
	private ITurnosService turnosService;
	
	//Listar todos los datos
	@GetMapping(path = "/todos")
	public List<TurnosEntity> obtenerTodo(){
		return turnosService.obtenerTodo();
	}

}
