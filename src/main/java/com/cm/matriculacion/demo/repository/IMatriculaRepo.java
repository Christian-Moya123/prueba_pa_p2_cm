package com.cm.matriculacion.demo.repository;

import java.time.LocalDateTime;

import com.cm.matriculacion.modelo.Matricula;
import com.cm.matriculacion.modelo.Vehiculo;

public interface IMatriculaRepo {
	
	boolean crear(Matricula v);	
	public void actualizar(Matricula v);
	public Matricula buscar(String cedula, String placa);
	public void eliminar(LocalDateTime fecha);

}
