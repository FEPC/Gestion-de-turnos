package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.turno.gestion_turnos.entity.ComercioEntity;
import com.asesoftware.turno.gestion_turnos.entity.ServicioEntity;
import com.asesoftware.turno.gestion_turnos.repository.IComercioRepositorio;

@Service
public class ComercioService implements IComercioService{
	
	@Autowired
	private IComercioRepositorio comercioRepositorio;

	@Override
	public List<ComercioEntity> obtenerTodo() {
	
		return comercioRepositorio.findAll();
	}

	@Override
	public ComercioEntity busquedaId(Integer id) {
		
		Optional<ComercioEntity> opcional = comercioRepositorio.findById(id);
		
		if(opcional.isPresent()) {
			return opcional.get();
		}else {
			return null;
		}
	}

}
