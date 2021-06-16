package com.asesoftware.turno.gestion_turnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.turno.gestion_turnos.dto.ResponseDTO;
import com.asesoftware.turno.gestion_turnos.service.ITurnosService;

@RestController
@RequestMapping(path = "api/v1/turnos")
public class TurnosController {
	
	@Autowired
	private ITurnosService turnosService;
	
	//Listar todos los datos
	@GetMapping(path = "/todos")
	public ResponseDTO obtenerTodo(){
		return turnosService.obtenerTodo();
	}
	
	//Listar por servicio
	@GetMapping(path = "/servicio/{idServicio}")
	public ResponseDTO consultarServicios(@PathVariable Integer idServicio) {
		return turnosService.consultarServicios(idServicio);
	}
	
	//Listar por comercio
	@GetMapping(path = "/comercio/{idComercio}")
	public ResponseDTO consultarComercios(@PathVariable Integer idComercio) {
		return turnosService.consultarComercios(idComercio);
	}
}
