package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.turno.gestion_turnos.entity.TurnosEntity;
import com.asesoftware.turno.gestion_turnos.repository.ITurnosRepositorio;

@Service
public class TurnosService implements ITurnosService{
	
	@Autowired
	private ITurnosRepositorio turnosRepositorio;

	@Override
	public List<TurnosEntity> obtenerTodo() {
		
		return turnosRepositorio.findAll();
	}

}
