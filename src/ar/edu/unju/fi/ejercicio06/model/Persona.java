package ar.edu.unju.fi.ejercicio06.model;

import java.time.LocalDate;

public class Persona {

	private int dni;
	private String nombre;
	private LocalDate fechaNac;
	private String provincia;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(int dni, String nombre, LocalDate fechaNac, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = provincia;
	}

	public Persona(int dni, String nombre, LocalDate fechaNac) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = "Jujuy";
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int calcularEdad(  ) {
		
		LocalDate fechaActual = LocalDate.now();
        int anios = fechaActual.getYear() - fechaNac.getYear();
        int meses = fechaActual.getMonthValue() - fechaNac.getMonthValue();
        int dias = fechaActual.getDayOfMonth() - fechaNac.getDayOfMonth();

        if (meses < 0 || (meses == 0 && dias < 0)) {
            anios--;
        }

        return anios;
		//proceso
				
	}
	
	public boolean verificarEdad() {
		//boolean bandera = true;
		
		return calcularEdad() >= 18;
		//proceso		
	}
	
	public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNac);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad());
        System.out.println(verificarEdad() ? "La persona es mayor de edad" : "La persona no es mayor de edad");
    }
}
