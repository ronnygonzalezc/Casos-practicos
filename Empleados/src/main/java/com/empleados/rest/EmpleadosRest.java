package com.empleados.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empleados.dao.EmpleadosDao;
import com.empleados.model.Empleados;

@RestController
@RequestMapping("empleados")
public class EmpleadosRest {

	@Autowired
	private EmpleadosDao empleadosDao;
	
	@PostMapping("/alta")
	public void altaEmpleado(@RequestBody Empleados empleado) {
		
		empleadosDao.save(empleado);
	}
	
	@GetMapping("/consulta")
	public List<Empleados> consultaEmpleado(){
		return empleadosDao.findAll();		
	}
	
	@DeleteMapping("/baja/{empleado_id}")
	public void bajaEmpleado(@PathVariable("empleado_id") Integer empleado_id) {
		empleadosDao.deleteById(empleado_id);
	}
	
	@PutMapping("/actualiza")
	public void actualizaEmpleado(@RequestBody Empleados empleado) {		
		empleadosDao.save(empleado);
	}
}
