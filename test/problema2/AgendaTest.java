package problema2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class AgendaTest {

	@Test
	public void testAgregarPersona() throws FileNotFoundException {
		
		File input = new File("test/resources/lista.txt");
		Scanner in = new Scanner(input);
		int n = 0;
		int entradas = Integer.valueOf(in.nextLine());
//		String[] lista;
//		lista = new String[entradas*2]; // inicializo el array de String
		Agenda agenda = new Agenda();
		String nombre = "";
		int telefono;
		while(in.hasNextLine()) {
			String linea = in.nextLine();
			System.out.println(linea); // imprime la entrada 1
			if(n%2==0) {
				nombre = linea;
			} else if(n%2!=0) {
				telefono = Integer.valueOf(linea);
				agenda.agregarPersona(nombre, telefono);
			}
//			lista[n] = linea; // otra forma es hacer un metodo que acepte esta lista
			n++;
		}
		in.close();
		
		File input2 = new File("test/resources/busqueda.txt");
		Scanner in2 = new Scanner(input2);
		String[] salida = new String[entradas];
		int m = 0;
		while(in2.hasNextLine()) {
			String linea = in2.nextLine();
			System.out.println(linea); // imprime la entrada 2
			
			salida[m] = agenda.buscarPersona(linea);
//			System.out.println(salida[m]); // imprime la salida
			
			m++;
		}
		in2.close();
		
		File input3 = new File("test/resources/salida.txt");
		Scanner in3 = new Scanner(input3);
		int p = 0;
		while(in3.hasNextLine()) {
			String linea = in3.nextLine();
			System.out.println(salida[p]); // imprime la salida
			assertTrue(linea.equals(salida[p]));
			p++;
		}
		in3.close();
		
	}

}
