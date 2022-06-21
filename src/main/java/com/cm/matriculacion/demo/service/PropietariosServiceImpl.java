package com.cm.matriculacion.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.matriculacion.demo.repository.IPropietariosRepository;
import com.cm.matriculacion.modelo.Propietario;


@Service
public class PropietariosServiceImpl implements IPropietariosService{

	@Autowired
	private IPropietariosRepository iPropietarioRepo;
	
	@Override
	public boolean crearPropietario(Propietario p) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.crear(p);
	}

	@Override
	public void actualizarP(Propietario p) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.actualizar(p);
	}

	@Override
	public Propietario buscarP(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.buscar(cedula);
	}

	@Override
	public void eliminarP(String cedula) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.eliminar(cedula);
	}

}
