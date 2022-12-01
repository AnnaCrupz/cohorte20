package com.akec.pruebasUnitarias;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
public class ClaseTests {
	Calculadora calc=new Calculadora(true);
	@Test
	void pruebaSuma() {
		// TODO Auto-generated method stub
		//Calculadora calc=new Calculadora(true);
		assertEquals(4,calc.suma(2, 2),"deberian de ser 4");
	}
	@Test
	@DisplayName("Probar si la calculadora esta encendida")
	void pruebaIsOn() {
		//Calculadora calc=new Calculadora(true);
		assertTrue(calc.isOn());
	}
	@Test
	@DisplayName("Prueba de división")
	void puebaDiv() {
		assertEquals(2.5,calc.division(5, 2));
	}
}
