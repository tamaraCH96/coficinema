package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservasDao;
import com.curso.model.Reserva;

@Service
public class ReservasServiceImpl implements ReservasService {

	@Autowired
	ReservasDao rd;
	
	@Autowired
	RestTemplate template;
	
	String urlVuelo ="http://localhost:8080";
	String urlHotel ="http://localhost:8081";
	
	@Override
	public void altaReserva(Reserva reserva) {
		
		rd.save(reserva);
		template.put(urlVuelo.concat("/vuelo/"+reserva.getIdvuelo()+"/"+reserva.getNpersonas()),Reserva.class);

	}

	@Override
	public List<Reserva> listar(String nombreHotel) {
		
		int reserva= template.getForObject(urlHotel.concat("/hoteles/"+nombreHotel), Reserva.class).getIdhotel();
		return rd.listarPorHotel(reserva);
		
	}

}
