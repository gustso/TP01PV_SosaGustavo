package ar.edu.unju.fi.ejercicio07;

import ar.edu.unju.fi.ejercicio07.model.Empleado;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e01 = new Empleado("Gustavo",300,50000);
		System.out.println(e01.toString());	
		e01.aumentarSalario();
		System.out.println(e01.toString());
		
	}

}
