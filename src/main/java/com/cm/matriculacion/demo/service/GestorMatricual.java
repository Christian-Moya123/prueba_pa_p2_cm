package com.cm.matriculacion.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.matriculacion.demo.repository.IMatriculaRepo;
import com.cm.matriculacion.modelo.Matricula;

@Service
public class GestorMatricual implements IGestorMatriculaService {
	
	@Autowired
	private IMatriculaLivinoService matriculLiviano;
	
	@Autowired
	private IMatriculaPesadoService matriculaPesado;
	
	@Autowired
	private IMatriculaRepo matriculaRepo;
	

	@Override
	public boolean crearM(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matricula ma = this.matriculaPesado.buscarM(cedula, placa);
		
		
		
		
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
		return null;
	}

	@Override
	public Matricula buscarM(String cedula, String placa) {
		// TODO Auto-generated method stub
		return null;
	}

}
