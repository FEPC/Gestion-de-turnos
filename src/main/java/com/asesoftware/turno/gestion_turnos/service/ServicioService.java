package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.turno.gestion_turnos.entity.ServicioEntity;
import com.asesoftware.turno.gestion_turnos.repository.IServicioRepositorio;

@Service
public class ServicioService implements IServicioService{

	@Autowired
	private IServicioRepositorio servicioRepositorio;
	
	@Override
	public List<ServicioEntity> obtenerTodo() {
		
		return servicioRepositorio.findAll();
	}

}
