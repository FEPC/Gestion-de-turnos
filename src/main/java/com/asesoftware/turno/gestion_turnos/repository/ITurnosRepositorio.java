package com.asesoftware.turno.gestion_turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.turno.gestion_turnos.entity.TurnosEntity;

public interface ITurnosRepositorio extends JpaRepository<TurnosEntity, Integer>{

}
