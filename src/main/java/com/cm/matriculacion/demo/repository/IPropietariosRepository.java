package com.cm.matriculacion.demo.repository;

import com.cm.matriculacion.modelo.Propietario;

public interface IPropietariosRepository {
	boolean crear(Propietario p);	
	public void actualizar(Propietario p);
	public Propietario buscar(String cedula);
	public void eliminar(String cudula);
}
