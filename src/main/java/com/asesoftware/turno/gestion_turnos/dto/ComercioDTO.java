package com.asesoftware.turno.gestion_turnos.dto;

import java.util.List;

import lombok.Data;

@Data
public class ComercioDTO {
	
	private Integer id_comercio;

	private String nom_comercio;
	
	private String aforo_maximo;
	
	private List<ServicioDTO> servicios;

}
