package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public ServicioEntity busquedaId(Integer id) {
		
		Optional<ServicioEntity> opcional = servicioRepositorio.findById(id);
		
		if(opcional.isPresent()) {
			return opcional.get();
		}else {
			return null;
		}
	}

	@Override
	public ServicioEntity crearServicio(ServicioEntity servicioEntity) {
		
		return servicioRepositorio.save(servicioEntity);
	}

	@Override
	public ServicioEntity editarServicio(ServicioEntity servicioEntity) {
		
		return servicioRepositorio.save(servicioEntity);
	}

	@Override
	public void eliminarServicio(Integer id) {
		
		servicioRepositorio.deleteById(id);
	}

}
