package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VuelosDao;
import com.curso.model.Vuelo;

@Service
public class VuelosServiceImplementado implements VuelosService {

	@Autowired
	VuelosDao dao;

	@Override
	public List<Vuelo> vuelosDisponibles(int plazasDisponibles) {
		return dao.vuelosDisponiblesPorPlazas(plazasDisponibles);
	}// vuelosDisponibles

	@Override
	public void actualizaVuelo(int idVuelo, int plazasReservadas) {
		Vuelo vuelo = dao.findById(idVuelo).orElse(null);
		int plazasTotales = vuelo.getPdisponibles()-plazasReservadas;
		vuelo.setPdisponibles(plazasTotales);
		dao.save(vuelo);
	}// actualizaVuelo

}// class