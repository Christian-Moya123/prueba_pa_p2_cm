package com.cm.matriculacion.modelo;

import java.time.LocalDateTime;

public class Matricula {
	private LocalDateTime fechaMatricula;
	private double valorMatricual;
	private Propietario propietario;
	private Vehiculo vehiculo;
	
	
	
	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMatricual=" + valorMatricual + ", propietario="
				+ propietario + ", vehiculo=" + vehiculo + "]";
	}
	//get y set
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public double getValorMatricual() {
		return valorMatricual;
	}
	public void setValorMatricual(double valorMatricual) {
		this.valorMatricual = valorMatricual;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	

	
}
