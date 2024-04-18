package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Jugador> jugadores = new ArrayList<Jugador>();
		
		Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n\t\tMENÚ DE JUGADORES");
            System.out.println("------------------------");
            System.out.println("1. Alta de jugador");
            System.out.println("2. Mostrar datos de un jugador");
            System.out.println("3. Mostrar jugadores ordenados por apellido");
            System.out.println("4. Modificar datos de un jugador");
            System.out.println("5. Eliminar un jugador");
            System.out.println("6. Mostrar cantidad total de jugadores");
            System.out.println("7. Mostrar jugadores por nacionalidad");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine(); // Consumir salto de línea

                switch (opcion) {
                    case 1:
                        altaJugador(entrada,jugadores);
                        break;
                    case 2:
                        mostrarDatosJugador(entrada,jugadores);
                        break;
                    case 3:
                        mostrarJugadoresOrdenadosApellido(jugadores);
                        break;
                    case 4:
                        //modificarDatosJugador(entrada);
                        break;
                    case 5:
                        //eliminarJugador(entrada);
                        break;
                    case 6:
                        //mostrarCantidadTotalJugadores();
                        break;
                    case 7:
                        //mostrarJugadoresPorNacionalidad(entrada);
                        break;
                    case 8:
                        System.out.println("Saliendo del menú...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                entrada.nextLine(); // Limpiar entrada errónea
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado. Motivo: " + e.getMessage());
            }
        } while (opcion != 8);

        entrada.close();
	}
	
	private static void altaJugador(Scanner entrada, List<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = entrada.nextLine();

            System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
            LocalDate fechaNacimiento = LocalDate.parse(entrada.nextLine());

            System.out.print("Ingrese la nacionalidad del jugador: ");
            String nacionalidad = entrada.nextLine();

            System.out.print("Ingrese la estatura del jugador (en cm): ");
            double estatura = entrada.nextDouble();
            entrada.nextLine(); // Consumir salto de línea

            System.out.print("Ingrese el peso del jugador (en kg): ");
            double peso = entrada.nextDouble();
            entrada.nextLine(); // Consumir salto de línea

            System.out.print("Ingrese la posición del jugador (delantero, medio, defensa, arquero): ");
            String posicion = entrada.nextLine();

            // Crear un nuevo objeto Jugador y agregarlo al ArrayList
            Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
            jugadores.add(jugador);
            System.out.println(jugadores.size()+"Jugador dado de alta correctamente.");
        } catch (Exception e) {
            System.out.println("Error al dar de alta al jugador. Motivo: " + e.getMessage());
        }
    }

	private static void mostrarDatosJugador(Scanner entrada, List<Jugador> jugadores) {
        System.out.println("aquiiiii"+jugadores.size());
		try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = entrada.nextLine();

            // Buscar el jugador en el ArrayList
            Jugador jugador = buscarJugador(nombre, apellido, jugadores);
            if (jugador != null) {
                System.out.println("\nDatos del jugador:");
                System.out.println("Nombre: " + jugador.getNombre() + " " + jugador.getApellido());
                System.out.println("Fecha de nacimiento: " + jugador.getFechaNac());
                System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                System.out.println("Estatura: " + jugador.getEstatura() + " cm");
                System.out.println("Peso: " + jugador.getPeso() + " kg");
                System.out.println("Posición: " + jugador.getPosicion());
                System.out.println("Edad: " + jugador.calcularEdad() + " años");
            } else {
                System.out.println("Jugador no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar datos del jugador. Motivo: " + e.getMessage());
        }
    }

    private static void mostrarJugadoresOrdenadosApellido(List<Jugador> jugadores) {
        
    	try {
            // Ordenar el ArrayList de jugadores por apellido
            Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));
                       
            // Mostrar los jugadores ordenados
            System.out.println("\nJugadores ordenados por apellido:");
            for (Jugador jugador : jugadores) {
                System.out.println(jugador);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar jugadores ordenados. Motivo: " + e.getMessage());
        }
    	/**
    	Jugador auxJugador = new Jugador();
    	boolean bandera = false;
    	
    	for(int i=0;i<=jugadores.size()-1;i++) {
    		
    		for (int j=i+1; j<= jugadores.size();j++)
    		
    			if (jugadores.get(i).getApellido().equals(jugadores.get(i+1).getApellido())){
    			
    			}    		
    		auxJugador = jugadores.get(i);
    	}
    	*/
    	//mostrar
    }
    
    private static Jugador buscarJugador(String nombre, String apellido, List<Jugador> jugadores) {
    	
    	Jugador jugadorEncontrado = new Jugador();
    	try {        	
            // Buscar jugador
            System.out.println("\nBuscar por apellido y nombre:" + jugadores.get(0).getApellido());
            for (Jugador jugador : jugadores) {
            	if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
            		jugadorEncontrado = jugador;
            	}                
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar jugadores ordenados. Motivo: " + e.getMessage());
        }
        return jugadorEncontrado;
    }

}
