package com.curso.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vuelo")
public class Vuelo {

	//Atributos
	@Id
	private int idvuelo;
	private String compania;
	private Date fecha;
	private double precio;
	private int pdisponibles;
	
	//Constructores	
	public Vuelo() {
		
	}

	public Vuelo(int idvuelo, String compania, Date fecha, double precio, int pdisponibles) {
		this.idvuelo = idvuelo;
		this.compania = compania;
		this.fecha = fecha;
		this.precio = precio;
		this.pdisponibles = pdisponibles;
	}

	//Getters&Setters
	public int getIdvuelo() {
		return idvuelo;
	}

	public void setIdvuelo(int idvuelo) {
		this.idvuelo = idvuelo;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPdisponibles() {
		return pdisponibles;
	}

	public void setPdisponibles(int pdisponibles) {
		this.pdisponibles = pdisponibles;
	}
	
}//class