package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftware.turno.gestion_turnos.dto.ResponseDTO;
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
	public ResponseDTO obtenerTodo() {
		
		return new ResponseDTO(mapperServicio.listaentityToDto(servicioRepositorio.findAll()), true, "Busqueda completada satisfactoriamente", HttpStatus.OK);
	}
	
	@Override
	public ResponseDTO busquedaId(Integer id) {
		
		Optional<ServicioEntity> opcional = servicioRepositorio.findById(id);
		
		if(opcional.isPresent()) {
			return new ResponseDTO(mapperServicio.entityDto(opcional.get()), true, "Busqueda completada satisfactoriamente", HttpStatus.OK);
		}else {
			return new ResponseDTO(null, false, "Id no encontrado", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO crearServicio(ServicioDTO servicioDto) {
		
		try {
			ServicioEntity servicioEntity = mapperServicio.dtoEntity(servicioDto);
			
			return new ResponseDTO(mapperServicio.entityDto(servicioRepositorio.save(servicioEntity)), true, "Servicio añadido satisfactoriamente", HttpStatus.OK);
		}catch(Exception e){
			
			return new ResponseDTO(null, false, "El servicio no se pudo crear", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO editarServicio(ServicioDTO servicioDto) {
		
		ServicioEntity servicioEntity = mapperServicio.dtoEntity(servicioDto);
		
		return new ResponseDTO(mapperServicio.entityDto(servicioRepositorio.save(servicioEntity)), true, "Servicio editado satisfactoriamente", HttpStatus.OK);
	}

	@Override
	public ResponseDTO eliminarServicio(Integer id) {
		
		try {
			servicioRepositorio.deleteById(id);
			
			return new ResponseDTO(null, true, "Servicio eliminado satisfactoriamente", HttpStatus.OK);
		}catch(Exception e) {
			
			return new ResponseDTO(null, false, "El servicio no se pudo eliminar", HttpStatus.OK);
		}
	}

}
