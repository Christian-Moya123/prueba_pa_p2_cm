package com.cm.matriculacion.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.matriculacion.demo.repository.IPropietariosRepository;
import com.cm.matriculacion.modelo.Vehiculo;


@Service
public class VehiculosServiceImpl implements IVehiculosService{

	@Autowired
	private IVehiculosService iVehiculoRepo;
	
	@Override
	public boolean crearPropietario(Vehiculo v) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.crearPropietario(v);
	}

	@Override
	public void actualizarP(Vehiculo v) {
		// TODO Auto-generated method stub
		this.actualizarP(v);
	}

	@Override
	public Vehiculo buscarP(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.buscarP(placa);
	}

	@Override
	public void eliminarP(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.eliminarP(placa);
	}

}
