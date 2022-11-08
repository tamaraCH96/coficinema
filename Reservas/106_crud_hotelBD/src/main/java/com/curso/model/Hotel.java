package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {

	@Id
	private int idhotel;
	private String nombre;
	private String categoria;
	private double precio;
	private boolean disponibilidad;
	
	
	public int getIdhotel() {
		return idhotel;
	}
	public void setIdhotel(int idhotel) {
		this.idhotel = idhotel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	public Hotel(int idhotel, String nombre, String categoria, double precio, boolean disponibilidad) {
		super();
		this.idhotel = idhotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
	}
	
	
	public Hotel() {
		super();
	}
	
	
	
	
}
