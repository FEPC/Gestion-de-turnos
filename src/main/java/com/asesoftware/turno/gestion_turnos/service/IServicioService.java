package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;

import com.asesoftware.turno.gestion_turnos.dto.ResponseDTO;
import com.asesoftware.turno.gestion_turnos.dto.ServicioDTO;

public interface IServicioService {
	
	public ResponseDTO obtenerTodo();
	
	public ResponseDTO busquedaId(Integer id);
	
	public ResponseDTO crearServicio(ServicioDTO servicioDto);
	
	public ResponseDTO editarServicio(ServicioDTO servicioDto);
	
	public ResponseDTO eliminarServicio(Integer id);

}
