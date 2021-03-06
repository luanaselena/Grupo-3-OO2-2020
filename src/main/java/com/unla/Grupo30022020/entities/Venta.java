package com.unla.Grupo30022020.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@OneToMany(cascade = CascadeType.MERGE)
	private Set<Pedido> pedidos= new HashSet<>();

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idvendedor", referencedColumnName = "id")
	private Vendedor vendedorEncargado;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idcliente", referencedColumnName = "id")
	private Cliente cliente;

	@Column
	private LocalDate fecha;

	@Column
	private LocalTime hora;

	@Column
	private float precioTotal;

	public Venta() {
	}

	public Venta(long id, LocalDate fecha, LocalTime hora, float precioTotal, Cliente cliente,
			Vendedor vendedorEncargado,Set<Pedido> pedidos) {
		this.id=id;
		this.fecha = fecha;
		this.hora = hora;
		this.precioTotal = precioTotal;
		this.vendedorEncargado = vendedorEncargado;
		this.cliente = cliente;
		this.pedidos=pedidos;
	}

	public Venta(LocalDate fecha, LocalTime hora, float precioTotal, Cliente cliente,
			Vendedor vendedorEncargado) {

		this.fecha = fecha;
		this.hora = hora;
		this.precioTotal = precioTotal;
		this.vendedorEncargado = vendedorEncargado;
		this.cliente = cliente;
	}

	public Vendedor getVendedorEncargado() {
		return vendedorEncargado;
	}

	public void setVendedorEncargado(Vendedor vendedorEncargado) {
		this.vendedorEncargado = vendedorEncargado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

}
