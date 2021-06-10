package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.turno.gestion_turnos.dto.ServicioDTO;
import com.asesoftware.turno.gestion_turnos.dto.TurnosDTO;
import com.asesoftware.turno.gestion_turnos.entity.ServicioEntity;
import com.asesoftware.turno.gestion_turnos.mapper.IServicioMapper;
import com.asesoftware.turno.gestion_turnos.repository.IServicioRepositorio;

@Service
public class ServicioService implements IServicioService{

	@Autowired
	private IServicioRepositorio servicioRepositorio;
	
	@Autowired
	private IServicioMapper mapperServicio;
	
	@Override
	public List<ServicioDTO> obtenerTodo() {
		
		return mapperServicio.listaentityToDto(servicioRepositorio.findAll());
	}
	
	@Override
	public ServicioDTO busquedaId(Integer id) {
		
		Optional<ServicioEntity> opcional = servicioRepositorio.findById(id);
		
		if(opcional.isPresent()) {
			return mapperServicio.entityDto(opcional.get());
		}else {
			return null;
		}
	}

	@Override
	public ServicioDTO crearServicio(ServicioDTO servicioDto) {
		
		ServicioEntity servicioEntity = mapperServicio.dtoEntity(servicioDto);
		
		return mapperServicio.entityDto(servicioRepositorio.save(servicioEntity));
	}

	@Override
	public ServicioDTO editarServicio(ServicioDTO servicioDto) {
		
		ServicioEntity servicioEntity = mapperServicio.dtoEntity(servicioDto);
		
		return mapperServicio.entityDto(servicioRepositorio.save(servicioEntity));
	}

	@Override
	public void eliminarServicio(Integer id) {
		
		servicioRepositorio.deleteById(id);
	}

}
