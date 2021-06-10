package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;

import com.asesoftware.turno.gestion_turnos.dto.ServicioDTO;
import com.asesoftware.turno.gestion_turnos.dto.TurnosDTO;

public interface IServicioService {
	
	public List<ServicioDTO> obtenerTodo();
	
	public ServicioDTO busquedaId(Integer id);
	
	public ServicioDTO crearServicio(ServicioDTO servicioDto);
	
	public ServicioDTO editarServicio(ServicioDTO servicioDto);
	
	public void eliminarServicio(Integer id);

}
