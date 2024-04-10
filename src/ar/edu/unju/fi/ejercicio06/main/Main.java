package ar.edu.unju.fi.ejercicio06.main;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio06.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear Persona 01
		Persona persona01 = new Persona();
		persona01.setDni(23434345);
		persona01.setNombre("Sebastian");
		persona01.setProvincia("Tucumán");
		persona01.setFechaNac(LocalDate.of(1973, 7, 24));
		
		//crear Persona 02
		
		Persona persona02 = new Persona(23456789,"Gustavo",LocalDate.of(2000,3,24),"Tucumán");
		
		//crear Persona 03
		Persona persona03 = new Persona(23456789,"Gustavo",LocalDate.of(2000,4,10));
		
		persona01.mostrarDatos();
		persona02.mostrarDatos();
		persona03.mostrarDatos();
		
	}

}
