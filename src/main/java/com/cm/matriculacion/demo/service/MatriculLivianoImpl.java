package com.cm.matriculacion.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.matriculacion.demo.repository.IMatriculaRepo;
import com.cm.matriculacion.modelo.Matricula;

@Service
public class MatriculLivianoImpl implements IMatriculaLivinoService {
	
	@Autowired
	private IMatriculaRepo iMatricualPRepo;

	@Override
	public boolean crearM(String cedula, String placa) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void actualizarM(Matricula v) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void eliminarM(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularM(String placa, BigDecimal saldo) {
		// TODO Auto-generated method stub
		BigDecimal valor = saldo.multiply(new BigDecimal(0.12));
		
		
		return valor;
	}

	@Override
	public Matricula buscarM(String cedula, String placa) {
		// TODO Auto-generated method stub
		return null;
	}

}
