package com.cm.matriculacion.demo.service;

import com.cm.matriculacion.modelo.Propietario;
import com.cm.matriculacion.modelo.Vehiculo;

public interface IPropietariosService {
	boolean crearPropietario(Propietario p);
	public void actualizarP(Propietario p);
	public Propietario buscarP(String cedula);
	public void eliminarP(String cedula);
}
