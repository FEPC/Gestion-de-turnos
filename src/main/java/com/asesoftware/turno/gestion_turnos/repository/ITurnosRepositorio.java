package com.asesoftware.turno.gestion_turnos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asesoftware.turno.gestion_turnos.entity.TurnosEntity;

public interface ITurnosRepositorio extends JpaRepository<TurnosEntity, Integer>{
	
	@Query("SELECT t FROM TurnosEntity t WHERE t.id_servicio = ?1")
	List<TurnosEntity> queryIdServicio(Integer idServicio);
	
	@Query("SELECT t FROM TurnosEntity t , ServicioEntity s WHERE t.id_servicio = s.id_servicio AND s.id_comercio = ?1")
	List<TurnosEntity> queryIdComercio(Integer idComercio);

}
