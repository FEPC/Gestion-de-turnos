package com.asesoftware.turno.gestion_turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesoftware.turno.gestion_turnos.dto.TurnosDTO;
import com.asesoftware.turno.gestion_turnos.entity.TurnosEntity;

@Mapper(componentModel = "spring")
public interface ITurnosMapper {
	
	public List<TurnosDTO> listaentityToDto(List<TurnosEntity> archivoEntity);
	
	public TurnosDTO entityDto (TurnosEntity archivoEntity);
	
	public List<TurnosEntity> listaeDtoToEntity(List<TurnosDTO> archivoDTO);
	
	public TurnosEntity dtoEntity(TurnosDTO dto);

}
