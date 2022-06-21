package com.cm.matriculacion.demo.repository;

import com.cm.matriculacion.modelo.Propietario;
import com.cm.matriculacion.modelo.Vehiculo;

public interface IVehiculosRepository {
	
	boolean crear(Vehiculo v);	
	public void actualizar(Vehiculo v);
	public Vehiculo buscar(String placa);
	public void eliminar(String placa);

}
