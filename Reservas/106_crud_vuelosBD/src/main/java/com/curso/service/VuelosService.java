package com.curso.service;

import java.util.List;

import com.curso.model.Vuelo;

public interface VuelosService {
	
	List<Vuelo> vuelosDisponibles(int plazasDisponibles);
	void actualizaVuelo(int idVuelo, int plazasReservadas);

}//interface