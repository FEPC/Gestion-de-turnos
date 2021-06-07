package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;

import com.asesoftware.turno.gestion_turnos.entity.ComercioEntity;

public interface IComercioService {
	
	public List<ComercioEntity> obtenerTodo();
	
	public ComercioEntity busquedaId(Integer id); 
	
	public ComercioEntity crearComercio(ComercioEntity comercioEntity);

}
