package problema2;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
	
	private Map<String, Integer> agenda = new HashMap<>();
	
	public void agregarPersona(String nombre, int telefono) {
		agenda.put(nombre, telefono);
	}
	
	public String buscarPersona(String nombre) {
		
		try {
			
			int telefono = this.agenda.get(nombre);
			return nombre + "=" + telefono;
			
		} catch(NullPointerException e1) {
			try {
				
				String[] palabras = nombre.split(" ");
				nombre = palabras[1] + " " + palabras[0];
				
				int telefono = this.agenda.get(nombre);
				return nombre + "=" + telefono;
				
			} catch(NullPointerException e2) {
				
				return "“Não encontrado”";
				
			}
		}
		
	}

}
