package ar.edu.unju.fi.ejercicio10.main;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza unaPizza = new Pizza();
		unaPizza.setDiametro(20);
		unaPizza.setIngredientesEspeciales(false);
		
		
		System.out.println("El precio de esta pizza es: "+ unaPizza.calcularPrecio());
		
		System.out.println("uso toString: "+ unaPizza.toString());
	}

}
