package com.empleados.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Empleados {

	@Id
	private Integer empleado_id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private LocalDate fecha_nacimiento;

	public Integer getEmpleado_id() {
		return empleado_id;
	}

	public void setEmpleado_id(Integer empleado_id) {
		this.empleado_id = empleado_id;
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

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	
}
