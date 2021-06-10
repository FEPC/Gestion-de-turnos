package com.asesoftware.turno.gestion_turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesoftware.turno.gestion_turnos.dto.ServicioDTO;
import com.asesoftware.turno.gestion_turnos.entity.ServicioEntity;

@Mapper(componentModel = "spring")
public interface IServicioMapper {
	
	public List<ServicioDTO> listaentityToDto(List<ServicioEntity> archivoEntity);
	
	public ServicioDTO entityDto (ServicioEntity archivoEntity);
	
	public List<ServicioEntity> listaeDtoToEntity(List<ServicioDTO> archivoDTO);
	
	public ServicioEntity dtoEntity(ServicioDTO dto);

}
