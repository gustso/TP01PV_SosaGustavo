package ar.edu.unju.fi.ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

        // Solicitar ingreso de número al usuario
        System.out.print("Ingrese un número entero entre 1 y 9: ");
        int numero = entrada.nextInt();

        // Validar rango del número
        while (numero < 1 || numero > 9) {
            System.out.println("Error: El número debe estar entre 1 y 9. Intente nuevamente:");
            numero = entrada.nextInt();
        }

        // Mostrar tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }        

	}

}
