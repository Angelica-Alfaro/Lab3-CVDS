package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
		
	/**Prueba edad inválida
	 * Se debería lanzar una excepción que diga parámetros inválidos, pues una edad no puede ser negativa
	 */
	@Test
	public void validateEdadInvalida() {
		double tarifaBase = 1000000;
		int diasAntelacion = 15;		
		int edad = -8;
	    	
		double tarifas = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
	    	
		Assert.assertEquals("ExcepcionParametrosInvalidos", tarifas);
	}
	
	/**Prueba antelación inválida
	 * Se debería lanzar una excepción que diga parámetros inválidos, pues una antelación no puede ser negativa
	 */
	@Test
	public void validateAntelacionInvalida() {
		double tarifaBase = 2500000;
		int diasAntelacion = -7;		
		int edad = 10;
		    	
		double tarifas = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
		    	
		Assert.assertEquals("ExcepcionParametrosInvalidos", tarifas);
	}
	
	/**Prueba tarifa inválida
	 * Se debería lanzar una excepción que diga parámetros inválidos, pues una tarifa no puede ser negativa
	 */
	@Test
	public void validateTarifaInvalida() {
		double tarifaBase = -750000;
		int diasAntelacion = 10;		
		int edad = 15;
			    	
		double tarifas = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
			    	
		Assert.assertEquals("ExcepcionParametrosInvalidos", tarifas);
	}
	
	/**Prueba descuento 15%
	 * Se debería lanzar el resultado con el descuento del 15% aplicado
	 */
	@Test
	public void validateDescuento15() {
		double tarifaBase = 2000000;
		int diasAntelacion = 21;		
		int edad = 40;
		double resultado = 1700000;	    	
		double tarifas = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
			    	
		Assert.assertTrue(resultado==tarifas);
		
	}
	
	/**Prueba descuento 5%
	 * Se debería lanzar el resultado con el descuento del 5% aplicado
	 */
	@Test
	public void validateDescuento5() {
		double tarifaBase = 650000;
		int diasAntelacion = 18;		
		int edad = 17;
		double resultado = 617500;	    	
		double tarifas = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
			    	
		Assert.assertTrue(resultado==tarifas);
		
	}
	
	/**Prueba descuento 8%
	 * Se debería lanzar el resultado con el descuento del 8% aplicado
	 */
	@Test
	public void validateDescuento8() {
		double tarifaBase = 3500000;
		int diasAntelacion = 5;		
		int edad = 70;
		double resultado = 3220000;	    	
		double tarifas = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
			    	
		Assert.assertTrue(resultado==tarifas);
		
	}
	
	/**Prueba sin descuento
	 * Se debería lanzar el resultado sin ningún descuento
	 */
	@Test
	public void validateSinDescuento() {
		double tarifaBase = 800000;
		int diasAntelacion = 7;		
		int edad = 30;
		double resultado = 800000;	    	
		double tarifas = CalculadorDescuentos.calculoTarifa(tarifaBase, diasAntelacion, edad);
			    	
		Assert.assertTrue(resultado==tarifas);
		
	}
	    
}
