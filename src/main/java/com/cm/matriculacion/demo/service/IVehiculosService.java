package com.cm.matriculacion.demo.service;

import com.cm.matriculacion.modelo.Propietario;
import com.cm.matriculacion.modelo.Vehiculo;

public interface IVehiculosService {
	boolean crearPropietario(Vehiculo v);
	public void actualizarP(Vehiculo v);
	public Vehiculo buscarP(String placa);
	public void eliminarP(String placa);
}
