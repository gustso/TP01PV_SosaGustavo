package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNac;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public int calcularEdad() {
		int edad = 0;
		
		return edad;
	}

	public String calcularSigno() {
		String signo = "";
		
		return signo;
	}
	
	public String calcularEstacion() {
		String estacion = "";
		
		return estacion;
	}
}
