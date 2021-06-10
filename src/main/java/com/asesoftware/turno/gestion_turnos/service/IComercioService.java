package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;

import com.asesoftware.turno.gestion_turnos.dto.ComercioDTO;

public interface IComercioService {
	
	public List<ComercioDTO> obtenerTodo();
	
	public ComercioDTO busquedaId(Integer id); 
	
	public ComercioDTO crearComercio(ComercioDTO comercioDto);
	
	public ComercioDTO editarComercio(ComercioDTO comercioDto);
	
	public void eliminarComercio(Integer id);

}
