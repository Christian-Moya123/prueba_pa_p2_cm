package com.cm.matriculacion.gestorMatricula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cm.matriculacion.modelo.Propietario;


@SpringBootApplication

public class GestorMatriculaApplication  implements CommandLineRunner {
	
	
	public static void main(String[] args) {
		SpringApplication.run(GestorMatriculaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
