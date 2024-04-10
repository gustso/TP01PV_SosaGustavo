package ar.edu.unju.fi.ejercicio07.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	private final static double aumentoMerito = 20000.00;
	private final static double salarioMinimo = 210000.00;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}	
	
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario >= salarioMinimo) {
			this.salario = salario;
		} else {
			this.salario = salarioMinimo;
		}
	}

	public void aumentarSalario() {
		salario = salario + aumentoMerito;		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", legajo=" + legajo + ", salario=" + salario + "]";
	}
	
	
}
