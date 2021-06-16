package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;

import com.asesoftware.turno.gestion_turnos.dto.ResponseDTO;

public interface ITurnosService {
	
	public ResponseDTO obtenerTodo();
	
	public ResponseDTO consultarServicios(Integer idServicio);

}
