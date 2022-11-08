package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@RestController
public class Controller {
	
	@Autowired
	HotelService hs;
	@ApiOperation(value = "Devuelve la lista de hoteles")
	@GetMapping(value="hoteles", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> listaHotels() {return hs.listaHoteles();}
	
	@ApiOperation(value = "Devuelve el hotel con el nombre y si esta disponible")
	@GetMapping(value="hoteles/{nombre}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Hotel hotelDispo(@ApiParam(value = "Nombre del hotel a buscar")  @PathVariable ("nombre") String nombre) {return hs.hotelDisponible(nombre);}
	
}
