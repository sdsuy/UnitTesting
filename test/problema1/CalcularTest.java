package problema1;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

public class CalcularTest {

	@Test
	public void testOperacion() {
		Calcular calcular = new Calcular();
		int resultado = calcular.operacion("10", "3");
		assertTrue(resultado==3);
		System.out.println(resultado);
	}
	
	@Test(expected = InputMismatchException.class)
	public void testOperacionMal() throws InputMismatchException {
		Calcular calcular = new Calcular();
		calcular.operacion("10", "Boa tarde");
	}
	
	@Test(expected = ArithmeticException.class)
	public void testOperacionPorCero() throws ArithmeticException {
		Calcular calcular = new Calcular();
		calcular.operacion("10", "0");
	}
	
	@Test(expected = InputMismatchException.class)
	public void testOperacionNoEntero() throws InputMismatchException {
		Calcular calcular = new Calcular();
		calcular.operacion("23.323", "0");
	}

}
