package com.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empleados.model.Empleados;

public interface EmpleadosDao extends JpaRepository<Empleados, Integer> {

}
