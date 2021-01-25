package com.fca.calidad.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class calculadoraTest {
	
	private calculadora cal;
	
	@Before
	public void inicializar()
	{
		cal= new calculadora();
	}

	@Test
	public void sumaTest() {
		
		//Ejercicio del codigo
		float resultadoEjecucion = cal.suma(4, 1);
		float resultadoEsperado = 5.0f;
		
		//Verificacion
		assertEquals(resultadoEsperado, resultadoEjecucion, 0.01);
		
	}

	@Test
	public void restaTest() {
		
		//Ejercicio del codigo
		float resultadoEjecucion = cal.resta(4, 1);
		float resultadoEsperado = 3.0f;
		
		//Verificacion
		assertEquals(resultadoEsperado, resultadoEjecucion, 0.01);
		
	}
	
	@Test
	public void multipliacionTest() {
		
		//Ejercicio del codigo
		float resultadoEjecucion = cal.multiplica(10, 15);
		float resultadoEsperado = 150.0f;
		
		//Verificacion
		assertEquals(resultadoEsperado, resultadoEjecucion, 0.01);
		
	}
	
	@Test
	public void divisionTest() {
		
		//Ejercicio del codigo
		float resultadoEjecucion = cal.divide(1000, 5);
		float resultadoEsperado = 200.0f;
		
		//Verificacion
		assertEquals(resultadoEsperado, resultadoEjecucion, 0.01);
		
	}

}
