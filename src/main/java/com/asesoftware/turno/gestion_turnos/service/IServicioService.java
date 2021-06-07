package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;

import com.asesoftware.turno.gestion_turnos.entity.ServicioEntity;

public interface IServicioService {
	
	public List<ServicioEntity> obtenerTodo();
	
	public ServicioEntity busquedaId(Integer id);
	
	public ServicioEntity crearServicio(ServicioEntity servicioEntity);
	
	public ServicioEntity editarServicio(ServicioEntity servicioEntity);
	
	public void eliminarServicio(Integer id);

}
