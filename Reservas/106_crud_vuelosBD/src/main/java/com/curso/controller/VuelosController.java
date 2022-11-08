package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Vuelo;
import com.curso.service.VuelosService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class VuelosController {

	@Autowired
	VuelosService service;

	@ApiOperation(value = "Devuelve la lista con todos los vuelos disponibles")
	@GetMapping(value = ("vuelos/{pdisponibles}"), produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vuelo> vuelosDisponibles(@ApiParam(value = "Plazas del vuelo a reservar") @PathVariable("pdisponibles") int plazasDisponibles) {
		return service.vuelosDisponibles(plazasDisponibles);
	}// vuelosDisponibles

	
	@ApiOperation(value = "Actualiza las plazas en un vuelo")
	@PutMapping(value = "vuelo/{idvuelo}/{preservadas}")
	public void actualizaVuelo(@ApiParam(value = "El id de vuelo a actualizar") @PathVariable("idvuelo") int idVuelo,
			@ApiParam(value = "Las plazas reservadas ") @PathVariable("preservadas") int plazasReservadas) {
		service.actualizaVuelo(idVuelo, plazasReservadas);
	}// actualizaVuelo

}// class