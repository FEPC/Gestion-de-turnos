package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftware.turno.gestion_turnos.dto.ComercioDTO;
import com.asesoftware.turno.gestion_turnos.dto.ResponseDTO;
import com.asesoftware.turno.gestion_turnos.entity.ComercioEntity;
import com.asesoftware.turno.gestion_turnos.mapper.IComercioMapper;
import com.asesoftware.turno.gestion_turnos.repository.IComercioRepositorio;

@Service
public class ComercioService implements IComercioService{
	
	@Autowired
	private IComercioRepositorio comercioRepositorio;
	
	@Autowired
	private IComercioMapper mapperComercio;

	@Override
	public ResponseDTO obtenerTodo() {
		
		return new ResponseDTO(mapperComercio.listaentityToDto(comercioRepositorio.findAll()), true, "Busqueda completada satisfactoriamente", HttpStatus.OK);
	}

	@Override
	public ResponseDTO busquedaId(Integer id) {
		
		Optional<ComercioEntity> opcional = comercioRepositorio.findById(id);
		
		if(opcional.isPresent()) {
			return new ResponseDTO(mapperComercio.entityDto(opcional.get()), true, "Busqueda completada satisfactoriamente", HttpStatus.OK);
		}else {
			return new ResponseDTO(null, false, "Id no encontrado", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO crearComercio(ComercioDTO comercioDto) {
		
		try {
			ComercioEntity comercioEntity = mapperComercio.dtoEntity(comercioDto);
			
			return new ResponseDTO(mapperComercio.entityDto(comercioRepositorio.save(comercioEntity)), true, "Comercio añadido satisfactoriamente", HttpStatus.OK);
		}catch(Exception e){
			
			return new ResponseDTO(null, false, "El comercio no se pudo crear", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO editarComercio(ComercioDTO comercioDto) {
		
		ComercioEntity comercioEntity = mapperComercio.dtoEntity(comercioDto);
		
		return new ResponseDTO(mapperComercio.entityDto(comercioRepositorio.save(comercioEntity)), true, "Comercio editado satisfactoriamente", HttpStatus.OK);
	}

	@Override
	public ResponseDTO eliminarComercio(Integer id) {
		
		try {		
			comercioRepositorio.deleteById(id);
			
			return new ResponseDTO(null, true, "Comercio eliminado satisfactoriamente", HttpStatus.OK);
		}catch(Exception e) {
			
			return new ResponseDTO(null, false, "El comercio no se pudo eliminar", HttpStatus.OK);
		}
	}

}
