package com.cm.matriculacion.demo.repository;

import org.springframework.stereotype.Repository;

import com.cm.matriculacion.modelo.Propietario;

@Repository
public class PropietariosRepositoryImpl implements IPropietariosRepository {

	@Override
	public boolean crear(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Propietario creado");
		return true;
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("propietario actualizado");
	}

	@Override
	public Propietario buscar(String cedula) {
		
		System.out.println(" se busca el propietario:" + cedula);
		System.out.println("se busca el propietario:" + cedula);
		Propietario pro =  new Propietario();
		pro.setCedula(cedula);
	
		return pro;
	}

	@Override
	public void eliminar(String cudula) {
		// TODO Auto-generated method stub
		System.out.println("Propietario eliminado");
		
	}

}
