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
	
	public ServicioDTO() {
		
	}

	public ServicioDTO(Integer id_servicio, Integer id_comercio, String nom_servicio, Date hora_apertura,
			Date hora_cierre, Integer duracion, List<TurnosDTO> turn) {
		super();
		this.id_servicio = id_servicio;
		this.id_comercio = id_comercio;
		this.nom_servicio = nom_servicio;
		this.hora_apertura = hora_apertura;
		this.hora_cierre = hora_cierre;
		this.duracion = duracion;
		this.turn = turn;
	}

}
