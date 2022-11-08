package com.curso.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelDao;
import com.curso.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService,Serializable {


	@Autowired
	HotelDao daoHotel;

	@Override
	public List<Hotel> listaHoteles() {return daoHotel.hotelDisponible();}

	@Override
	public Hotel hotelDisponible(String nombre) {
		
        List<Hotel> hoteles= daoHotel.findAll();
        
        Hotel hotelEncontrado;
        
        for (Hotel hotel : hoteles) {
        	
            if(hotel.getNombre().equalsIgnoreCase(nombre)){
            	
            	hotelEncontrado = new Hotel(hotel.getIdhotel(),hotel.getNombre(),hotel.getCategoria(),hotel.getPrecio(),hotel.isDisponibilidad());
            }
        }
        
        return hotelEncontrado=new Hotel();
	}

}
