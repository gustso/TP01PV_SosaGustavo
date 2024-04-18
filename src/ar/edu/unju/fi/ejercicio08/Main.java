package ar.edu.unju.fi.ejercicio08;

import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraEspecial ce = new CalculadoraEspecial();
		ce.setN(2);
		System.out.println("resultado Sum: "+ce.calcularSumatoria());
		System.out.println("resultado Prod: "+ce.calcularProductoria());
	}

}
