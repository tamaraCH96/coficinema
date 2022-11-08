package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;

public interface ReservasService {
	
	void altaReserva(Reserva reserva);
	
	List<Reserva> listar(String nombreHotel);
	
	

}
