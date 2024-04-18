package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {

	private double diametro;
	private double precio;
	private double area;
	private boolean ingredientesEspeciales;
	
	public final int ESPECIAL20 = 500;
	public final int ESPECIAL30 = 750;
	public final int ESPECIAL40 = 1000;
	
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
	
	public double calcularPrecio() {
		double precio = 0;
		
		//logica 
		//Si la pizza tiene un diámetro de 20 cm y no lleva ingredientes especiales, el precio es igual a 4500$
		if (diametro == 20 && !ingredientesEspeciales) {
			precio = 4500;
		} else {
			if (diametro == 20 && ingredientesEspeciales) {
				precio = 4500 + ESPECIAL20;				
			}
		}		
		
		return precio;
	}

	@Override
	public String toString() {
		return "Pizza [precio=" + precio + "]";
	}
	
	
}
