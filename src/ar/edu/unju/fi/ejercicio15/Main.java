package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

        // Solicitar número entero en rango [5, 10]
        int tamanoArray;
        do {
            System.out.print("Ingrese un número entero entre 5 y 10 (tamaño del array): ");
            tamanoArray = entrada.nextInt();
        } while (tamanoArray < 5 || tamanoArray > 10);

        // Crear array de String con el tamaño especificado
        String[] nombres = new String[tamanoArray];

        // Solicitar nombres de personas
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = entrada.nextLine(); // Leer toda la línea para nombres con espacios
        }

        // Mostrar nombres desde el inicio del array
        System.out.println("\nNombres desde el inicio del array:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        // Mostrar nombres desde el final del array
        System.out.println("\nNombres desde el final del array:");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println(nombres[i]);
        }

        entrada.close();
	}

}
