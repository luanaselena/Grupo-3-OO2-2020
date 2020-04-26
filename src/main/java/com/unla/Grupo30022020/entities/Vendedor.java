package com.unla.Grupo30022020.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Vendedor extends Empleado {
	
	@Column(name = "plus", nullable = true)
	private float plus;
	
	public Vendedor() {
		
	}

	public Vendedor(String nombre, String apellido, LocalDate fechaDeNacimiento, long dni, LocalTime horasPorJornada,
			float sueldoBasico, float plus) {
		super(nombre, apellido, fechaDeNacimiento, dni, horasPorJornada, sueldoBasico);
		this.plus = plus;
	}

	public float getPlus() {
		return plus;
	}

	public void setPlus(float plus) {
		this.plus = plus;
	}
	
	
}