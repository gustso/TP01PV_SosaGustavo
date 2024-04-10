package ar.edu.unju.fi.ejercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long telefono = 5834387;
		int caracteristica = 388;
		String telefonos = "388-5834387";
		long celu = 3885834578l;
		double resultado = Math.cos(0.5);
		
		
		//ej 4
		Scanner scanner = new Scanner(System.in);
		
		long factorial = 1;
		System.out.println("Ingrese numero :");
			
		if(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			
			if(num<0 || num >10) {
				System.out.println("Solo calcula con numeros del 0 al 10 !");
			}
			else {
				while(num!=0) {
					factorial=factorial*num;
					num--;
				}
				System.out.println("El FACTORIAL ES: "+factorial);
				scanner.close();
			}
		}
		else {
			System.out.println("Se ingreso datos incorrectos");
		}
		
		
		
	}

}
