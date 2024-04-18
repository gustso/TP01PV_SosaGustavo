package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <DestinoTuristico> listadoDestinos = new ArrayList<DestinoTuristico>();
		
		listadoDestinos.add(new DestinoTuristico(1,"Jujuy",23,"Argentina",3));
		listadoDestinos.add(new DestinoTuristico(2,"Salta",23,"Argentina",3));
		listadoDestinos.add(new DestinoTuristico(3,"Tucuman",23,"Argentina",3));
		
		//listadoDestinos.add
		
		listadoDestinos.forEach(dT -> System.out.println(dT));
		
		//programacion funcional
		
		double aumentoPorInflacion = 10;
		listadoDestinos.forEach(dT -> {
			dT.setPrecio(aumentoPorInflacion + dT.getPrecio());
			System.out.println(dT);	
		});			
		
		//List ArrayList y el problema de la programacion funcional
		
		//Declarativo.
		List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8, 16);

		//DestinoTuristico nuevoDT = new DestinoTuristico(4,"Misiones",23,"Argentina",3);
		//listadoDestinos = (List.of(nuevoDT));
		
		int contador = 0;
		for(int numero : numeros) {
		    if(numero > 15) {
		        contador ++;
		    }
		}
			System.out.println(contador);
	
			//Funcional
			Long result = numeros.stream().filter(num -> num > 50).count();
			System.out.println(result);
			
		//listadoDestinos.stream()
			
	}

	
}
