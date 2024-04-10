package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner entrada = new Scanner(System.in);

        // Solicitar ingreso de número al usuario
        System.out.print("Ingrese un número entero entre 0 y 10: ");
        int numero = entrada.nextInt();

        // Validar rango del número
        while (numero < 0 || numero > 10) {
            System.out.println("Error: El número debe estar entre 0 y 10. Intente nuevamente:");
            numero = entrada.nextInt();
        }

        // Cálculo del factorial
        int factorial = 1;
        int contador = 1;
        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }

        // Mostrar resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
    
        		
	}

}
