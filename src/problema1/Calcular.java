package problema1;

import java.util.InputMismatchException;

public class Calcular {
	
	private int x;
	private int y;
	
	public int operacion(String x, String y) throws InputMismatchException, ArithmeticException {
		
		try {
			
			this.x = Integer.valueOf(x);
			this.y = Integer.valueOf(y);

		// Primero intento leer el int del String
		} catch(NumberFormatException e) {
			
			System.err.println("java.util.InputMismatchException");
			throw new InputMismatchException();
			
		}
		
		// Si y es 0
		if(this.y == 0) {
			System.err.println("java.lang.ArithmeticException: / by Zero");
			throw new ArithmeticException();
		}
		
		// Si al menos uno de ellos es un entero negativo
		if(this.x < 0 || this.y < 0) {
			System.err.println("java.util.InputMismatchException");
			throw new InputMismatchException();
		}
		
		// Si todo es valido
		return this.x/this.y;
		
	}

}
