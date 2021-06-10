package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;

import com.asesoftware.turno.gestion_turnos.dto.ComercioDTO;
import com.asesoftware.turno.gestion_turnos.dto.ResponseDTO;

public interface IComercioService {
	
	public ResponseDTO obtenerTodo();
	
	public ResponseDTO busquedaId(Integer id); 
	
	public ResponseDTO crearComercio(ComercioDTO comercioDto);
	
	public ResponseDTO editarComercio(ComercioDTO comercioDto);
	
	public ResponseDTO eliminarComercio(Integer id);

}
