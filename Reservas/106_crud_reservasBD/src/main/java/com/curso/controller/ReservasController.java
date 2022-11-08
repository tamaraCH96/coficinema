package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Reserva;
import com.curso.service.ReservasService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class ReservasController {
	
	@Autowired
	ReservasService rs;
	
	@ApiOperation(value = "Da de alta una reserva")
	@PostMapping(value="reserva", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void altaReserva(@RequestBody Reserva reserva) {rs.altaReserva(reserva);}

	@ApiOperation(value = "Devuelve la lista con todos las reservas")
	@GetMapping(value="reservas/{nombreHotel}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> listaPorHotel(@ApiParam(value = "Nombre del hotel")  @PathVariable("nombreHotel") String nombreHotel){return rs.listar(nombreHotel);}
}
