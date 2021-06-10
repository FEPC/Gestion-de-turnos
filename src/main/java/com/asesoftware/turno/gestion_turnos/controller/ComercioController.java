package com.asesoftware.turno.gestion_turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.turno.gestion_turnos.dto.ComercioDTO;
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
	public List<ComercioDTO> obtenerTodo(){
		return comercioService.obtenerTodo();
	}
	
	//Busqueda de elemnto por ID
	@GetMapping(path = "/buscar/{id}")
	public ComercioDTO busquedaId(@PathVariable Integer id){
		return comercioService.busquedaId(id);
	}
	
	//Creación
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ComercioDTO crearComercio(@RequestBody ComercioDTO comercioDto) {
		try {
			return comercioService.crearComercio(comercioDto);
		}catch(Exception e) {
			return null;
		}
	}
	
	//Editar
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ComercioDTO editarComercio(@RequestBody ComercioDTO comercioDto) {

		return comercioService.editarComercio(comercioDto);
	}
	
	//Eliminar
	@GetMapping(path = "/eliminar/{id}")
	public void eliminarComercio(@PathVariable Integer id) {
		
		comercioService.eliminarComercio(id);
	}
	
}
