package com.asesoftware.turno.gestion_turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.turno.gestion_turnos.entity.ServicioEntity;

public interface IServicioRepositorio extends JpaRepository<ServicioEntity, Integer>{

}
