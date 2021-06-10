package com.asesoftware.turno.gestion_turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.asesoftware.turno.gestion_turnos.dto.ComercioDTO;
import com.asesoftware.turno.gestion_turnos.entity.ComercioEntity;

@Mapper(componentModel = "spring")
public interface IComercioMapper {
	
	public List<ComercioDTO> listaentityToDto(List<ComercioEntity> archivoEntity);
	
	public ComercioDTO entityDto (ComercioEntity archivoEntity);
	
	public List<ComercioEntity> listaeDtoToEntity(List<ComercioDTO> archivoDTO);
	
	public ComercioEntity dtoEntity(ComercioDTO dto);

}
