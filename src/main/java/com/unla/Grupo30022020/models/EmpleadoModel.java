package com.unla.Grupo30022020.models;

import java.time.LocalTime;
import java.util.Date;

public class EmpleadoModel extends PersonaModel{
	
	private LocalTime horasPorJornada;
	private float sueldoBasico;
	
	public EmpleadoModel() {
		
	}

	public EmpleadoModel(long id, String nombre, String apellido, Date fechaDeNacimiento, long dni,
			LocalTime horasPorJornada, float sueldoBasico) {
		super(id, nombre, apellido, fechaDeNacimiento, dni);
		this.horasPorJornada = horasPorJornada;
		this.sueldoBasico = sueldoBasico;
	}

	public LocalTime getHorasPorJornada() {
		return horasPorJornada;
	}

	public void setHorasPorJornada(LocalTime horasPorJornada) {
		this.horasPorJornada = horasPorJornada;
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	
	
}
