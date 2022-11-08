package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Hotel;


public interface HotelDao extends JpaRepository<Hotel, Integer>{

	@Query(value="select * from hotel where disponibilidad=True",nativeQuery=true)
	public List<Hotel> hotelDisponible();
}
