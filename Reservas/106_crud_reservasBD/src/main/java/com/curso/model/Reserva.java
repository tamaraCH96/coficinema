package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reserva")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idreserva;
	
	private String cliente;
	private String dni;
	
	private int idhotel;
	private int idvuelo;
	private int npersonas;
	
	public Reserva(int idreserva, String cliente, String dni, int idhotel, int idvuelo, int npersonas) {
		super();
		this.idreserva = idreserva;
		this.cliente = cliente;
		this.dni = dni;
		this.idhotel = idhotel;
		this.idvuelo = idvuelo;
		this.npersonas = npersonas;
	}
	
	public Reserva() {
		super();
	}

	public int getIdreserva() {
		return idreserva;
	}

	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdhotel() {
		return idhotel;
	}

	public void setIdhotel(int idhotel) {
		this.idhotel = idhotel;
	}

	public int getIdvuelo() {
		return idvuelo;
	}

	public void setIdvuelo(int idvuelo) {
		this.idvuelo = idvuelo;
	}

	public int getNpersonas() {
		return npersonas;
	}

	public void setNpersonas(int npersonas) {
		this.npersonas = npersonas;
	}
	
	
}
