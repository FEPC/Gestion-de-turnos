package com.asesoftware.turno.gestion_turnos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "turnos")
public class TurnosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_turno")
	private Integer id_turno;
	
	@Column(name = "id_servicio")
	private Integer id_servicio;
	
	@Column(name = "fecha_turno")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_turno;
	
	@Column(name = "hora_inicio")
	@Temporal(TemporalType.TIME)
	private Date hora_inicio;
	
	@Column(name = "hora_fin")
	@Temporal(TemporalType.TIME)
	private Date hora_fin;
	
	@Column(name = "estado")
	private String estado;

}
