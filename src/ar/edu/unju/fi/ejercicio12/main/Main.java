package ar.edu.unju.fi.ejercicio12.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Persona unaPersona = new Persona();
		
		//buena práctica
		DateFormat formateador = new SimpleDateFormat("dd/M/yy"); 
		
		//no es una buena práctica
		//SimpleDateFormat formateador = new SimpleDateFormat("dd/M/yy");
		
		Date fecha = formateador.parse("11/04/2020");
		
		Calendar calendario = new GregorianCalendar();
		
		calendario.setTime(fecha);
		
		unaPersona.setNombre("Gustavo");
		unaPersona.setFechaNac(calendario);
		
		System.out.println("fecha Nacimiento Año "+unaPersona.getFechaNac().get(Calendar.YEAR));
		System.out.println("fecha Nacimiento Dia "+unaPersona.getFechaNac().get(Calendar.DAY_OF_MONTH));
		System.out.println("fecha Nacimiento Mes "+unaPersona.getFechaNac().get(Calendar.MONTH));
	}

}
