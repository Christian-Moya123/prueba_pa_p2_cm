package com.cm.matriculacion.demo.repository;

import org.springframework.stereotype.Repository;

import com.cm.matriculacion.modelo.Propietario;
import com.cm.matriculacion.modelo.Vehiculo;

@Repository
public class VehiculosRepository implements IVehiculosRepository{

	@Override
	public boolean crear(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("vehiculo creado");
		return true;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("vehiculo actualizado");
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println(" se busca el vehiculo:" + placa);
		System.out.println("se busca el vehiculo:" + placa);
		
		Vehiculo veh = new Vehiculo();
		
		veh.setPlaca(placa);
	
		return veh;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Propietario eliminado");
	}
	
	

}
