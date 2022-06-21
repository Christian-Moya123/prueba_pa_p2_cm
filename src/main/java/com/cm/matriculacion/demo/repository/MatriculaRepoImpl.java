package com.cm.matriculacion.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.cm.matriculacion.modelo.Matricula;
import com.cm.matriculacion.modelo.Propietario;
import com.cm.matriculacion.modelo.Vehiculo;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepo {

	@Override
	public boolean crear(Matricula v) {
		// TODO Auto-generated method stub
		System.out.println("Matricula creado");
		return true;
	}

	@Override
	public void actualizar(Matricula v) {
		// TODO Auto-generated method stub
		System.out.println("matricula actualizada");
	}

	@Override
	public Matricula buscar(String cedula, String placa){
		// TODO Auto-generated method stub
		System.out.println(" se busca la matricula:" +cedula);
		Matricula maa = new Matricula();
		maa.setFechaMatricula(cedula);
	
		return maa;
	}

	@Override
	public void eliminar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println(" se a eliminado la matricula " +fecha);
	}

	
	
}
