package problema1;

import java.util.InputMismatchException;

public class Calcular {
	
	private int x;
	private int y;
	
	public int operacion(String x, String y) throws InputMismatchException {
		
		try {
			
			this.x = Integer.valueOf(x);
			this.y = Integer.valueOf(y);

		// Primero intento leer el int del String
		} catch(NumberFormatException e) {
			
			System.err.println("java.util.InputMismatchException");
			throw new InputMismatchException();
			
		}
		
		// Luego verifico si x es mayor o igual a 0 y si y es mayor a 0
		if(this.x >= 0 && this.y > 0) {
			return this.x/this.y;
		} else {
			System.err.println("java.util.InputMismatchException");
			throw new InputMismatchException();
		}
		
	}

}
