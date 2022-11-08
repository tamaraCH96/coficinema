package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.curso.model.Vuelo;

public interface VuelosDao extends JpaRepositoryImplementation<Vuelo, Integer> {

	@Query(value="SELECT * FROM vuelo WHERE pdisponibles >= ?1", nativeQuery=true)
	public List<Vuelo> vuelosDisponiblesPorPlazas(int plazas_disponibles);

}// interface