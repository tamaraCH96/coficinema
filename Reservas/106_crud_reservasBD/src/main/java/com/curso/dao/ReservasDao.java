package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Reserva;

public interface ReservasDao extends JpaRepository<Reserva, Integer> {
	
	@Query(value="select * from reserva where idhotel=?1",nativeQuery=true)
	public List<Reserva> listarPorHotel(int idreserva);
	

}
