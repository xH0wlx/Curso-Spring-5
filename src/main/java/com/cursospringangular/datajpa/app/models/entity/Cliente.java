package com.cursospringangular.datajpa.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "clientes") // Esta notación se puede omitir si la clase se llama igual que la tabla
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente") 
	private Long id;

	@NotEmpty
	private String nombre;
	@NotEmpty
	private String apellido;
	@NotEmpty
	@Email
	private String email;

	@NotNull
	@Column(name = "created_at") // Esta notación se puede omitir si la variable tiene el mismo nombre de la
									// columna
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;

	private String foto;

	// CascadeType.ALL => Ej: Si el cliente se elimina, se eliminas sus facturas, si se guarda un cliente, se guardan sus facturas.
	// MappedBy => En la tabla Facturas creará una clave foránea a Cliente
	@OneToMany(mappedBy="cliente" ,fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval = true)
	private List<Factura> facturas;

	/*
	 * @PrePersist public void prePersist() { createdAt = new Date(); }
	 */
	public Cliente() {
		facturas = new ArrayList<Factura>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public void addFactura(Factura factura) {
		facturas.add(factura);
	}
	
	@Override
	public String toString() {
		return nombre + " " + apellido;
	}

}
