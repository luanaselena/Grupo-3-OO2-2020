package com.unla.Grupo30022020.models;

import java.time.LocalDate;
import java.util.Date;

public class ClienteModel extends PersonaModel{
	private String mail;
	
	public ClienteModel() {
		
	}

	public ClienteModel(long id, String nombre, String apellido, Date fechaDeNacimiento, long dni, String mail) {
		super(id, nombre, apellido, fechaDeNacimiento, dni);
		this.mail = mail;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}