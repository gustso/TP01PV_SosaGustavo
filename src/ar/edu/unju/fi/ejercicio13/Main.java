package ar.edu.unju.fi.ejercicio13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
	        int[] numeros = new int[8]; // Declarar array de 8 elementos enteros

	        
	        // Solicitar y almacenar valores en el array
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Ingrese un número entero (" + (i + 1) + "/" + numeros.length + "): ");
	            numeros[i] = entrada.nextInt();
	        }
	        
	        //numeros[11] = 123;

	        List<Integer> lista = new ArrayList<>();
	        lista.add(12);
	        //agregar
	        	        
	        
	        // Mostrar el índice y el valor de cada elemento
	        System.out.println("\nContenido del array:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Índice: " + i + ", Valor: " + numeros[i]);
	        }

	        entrada.close();
	}

}
