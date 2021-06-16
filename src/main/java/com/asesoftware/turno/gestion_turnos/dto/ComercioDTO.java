package com.asesoftware.turno.gestion_turnos.dto;

import java.util.List;

import lombok.Data;

@Data
public class ComercioDTO {
	
	private Integer id_comercio;

	private String nom_comercio;
	
	private String aforo_maximo;
	
	private List<ServicioDTO> servicios;
	
	public ComercioDTO() {
		
	}

	public ComercioDTO(Integer id_comercio, String nom_comercio, String aforo_maximo, List<ServicioDTO> servicios) {
		super();
		this.id_comercio = id_comercio;
		this.nom_comercio = nom_comercio;
		this.aforo_maximo = aforo_maximo;
		this.servicios = servicios;
	}

}
