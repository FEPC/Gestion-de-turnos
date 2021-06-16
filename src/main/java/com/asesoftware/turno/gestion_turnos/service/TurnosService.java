package com.asesoftware.turno.gestion_turnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftware.turno.gestion_turnos.dto.ResponseDTO;
import com.asesoftware.turno.gestion_turnos.dto.TurnosDTO;
import com.asesoftware.turno.gestion_turnos.entity.TurnosEntity;
import com.asesoftware.turno.gestion_turnos.mapper.ITurnosMapper;
import com.asesoftware.turno.gestion_turnos.repository.ITurnosRepositorio;

@Service
public class TurnosService implements ITurnosService{
	
	@Autowired
	private ITurnosRepositorio turnosRepositorio;
	
	@Autowired
	private ITurnosMapper mapperTurnos;
	
	@Override
	public ResponseDTO obtenerTodo() {
		
		return new ResponseDTO(mapperTurnos.listaentityToDto(turnosRepositorio.findAll()), true, "Busqueda completada satisfactoriamente", HttpStatus.OK);
	}

	@Override
	public ResponseDTO consultarServicios(Integer idServicio) {
		
		List<TurnosEntity> listTurnosEntity = turnosRepositorio.queryIdServicio(idServicio);
		
		return new ResponseDTO(mapperTurnos.listaentityToDto(listTurnosEntity), true, "Busqueda completada satisfactoriamente", HttpStatus.OK);
	}

}
