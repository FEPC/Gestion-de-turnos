package com.asesoftware.turno.gestion_turnos.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ServicioDTO {
	
private Integer id_servicio;
	
	private Integer id_comercio;
	
	private String nom_servicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss", timezone = "America/New_York")
	private Date hora_apertura;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss", timezone = "America/New_York")
	private Date hora_cierre;
	
	private Integer duracion;
	
	private List<TurnosDTO> turn;

}
