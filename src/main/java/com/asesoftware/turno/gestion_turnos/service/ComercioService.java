package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.turno.gestion_turnos.dto.ComercioDTO;
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
	public List<ComercioDTO> obtenerTodo() {
		
		return mapperComercio.listaentityToDto(comercioRepositorio.findAll());
	}

	@Override
	public ComercioDTO busquedaId(Integer id) {
		
		Optional<ComercioEntity> opcional = comercioRepositorio.findById(id);
		
		if(opcional.isPresent()) {
			return mapperComercio.entityDto(opcional.get());
		}else {
			return null;
		}
	}

	@Override
	public ComercioDTO crearComercio(ComercioDTO comercioDto) {
		
		ComercioEntity comercioEntity = mapperComercio.dtoEntity(comercioDto);
		
		return mapperComercio.entityDto(comercioRepositorio.save(comercioEntity));
	}

	@Override
	public ComercioDTO editarComercio(ComercioDTO comercioDto) {
		
		ComercioEntity comercioEntity = mapperComercio.dtoEntity(comercioDto);
		
		return mapperComercio.entityDto(comercioRepositorio.save(comercioEntity));
	}

	@Override
	public void eliminarComercio(Integer id) {
		
		comercioRepositorio.deleteById(id);
	}

}
