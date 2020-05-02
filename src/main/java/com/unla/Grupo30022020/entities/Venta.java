package com.unla.Grupo30022020.entities;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

	@Id
	@GeneratedValue
	@Column(name = "idVenta")
	private long idVenta;

	@Column
	private int nroVenta;
	
	@OneToMany(fetch = FetchType.LAZY)
	private Set<Pedido> pedidos;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idVendedor", referencedColumnName = "id")
	private Vendedor vendedorEncargado;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCliente", referencedColumnName = "id")
	private Cliente cliente;

	@Column
	private LocalDate fecha;

	@Column
	private LocalDate hora;

	@Column
	private float precioTotal;

	public Venta() {
	}

	public Venta(int nroVenta, LocalDate fecha, LocalDate hora, float precioTotal, Cliente cliente,
			Vendedor vendedorEncargado) {

		this.nroVenta = nroVenta;
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

	public long getIdVenta() {
		return idVenta;
	}

	protected void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}

	public int getNroVenta() {
		return nroVenta;
	}

	public void setNroVenta(int nroVenta) {
		this.nroVenta = nroVenta;
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

	public LocalDate getHora() {
		return hora;
	}

	public void setHora(LocalDate hora) {
		this.hora = hora;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

}