package com.cm.matriculacion.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.cm.matriculacion.modelo.Matricula;

public interface IGestorMatriculaService {
	boolean crearM(String cedula, String placa);	
	public void actualizarM(Matricula v);
	public Matricula buscarM(String cedula, String placa);
	public void eliminarM(LocalDateTime fecha);
	public BigDecimal calcularM(String placa, BigDecimal saldo);

}
