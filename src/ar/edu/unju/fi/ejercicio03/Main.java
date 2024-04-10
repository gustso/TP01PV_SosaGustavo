package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
	// Crear objeto Scanner para leer entrada por consola
    Scanner entrada = new Scanner(System.in);

    // Solicitar ingreso de número al usuario    
    System.out.println("Ingrese un número entero: ");
    int numero = entrada.nextInt();

    // Determinar paridad del número
    if (numero % 2 == 0) {
        // Si el número es par, calcular y mostrar el triple
        int triple = numero * 3;
        System.out.println("El triple del número par es: " + triple);
    } else {
        // Si el número es impar, calcular y mostrar el doble
        int doble = numero * 2;
        System.out.println("El doble del número impar es: " + doble);
    }    
	}

}
