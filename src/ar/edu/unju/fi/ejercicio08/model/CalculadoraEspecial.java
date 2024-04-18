package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
	
	private int n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int calcularSumatoria() {
		System.out.println(n);
		int resultado = 0;
		for (int k=1;k<=n;k++) {
			System.out.println(n);
			resultado=(((k+1)*k)/2)^2+resultado;
		}		
		return resultado;
	}

	public int calcularProductoria() {
		int resultado = 1;
		for (int k=1;k<n;k++) {
			resultado=(k+4)*k*resultado;
		}		
		return resultado;
	}
}
