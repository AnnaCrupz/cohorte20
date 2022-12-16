package com.example.demo.myappdb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden")
public class OrdenModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombreProducto;
	@ManyToOne
	private UsuarioModel usuario;
	@OneToOne(mappedBy = "orden")
	private DetalleOrden detalle;

	public OrdenModel() {
		super();
	}

	public OrdenModel(Long id, String nombreProducto) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public DetalleOrden getDetalle() {
		return detalle;
	}

	public void setDetalle(DetalleOrden detalle) {
		this.detalle = detalle;
	}

	public OrdenModel(Long id, String nombreProducto, UsuarioModel usuario, DetalleOrden detalle) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.usuario = usuario;
		this.detalle = detalle;
	}

}
