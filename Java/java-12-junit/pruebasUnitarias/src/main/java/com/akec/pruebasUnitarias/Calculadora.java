package com.akec.pruebasUnitarias;

public class Calculadora {

	private boolean isOn;

	// constructor
	public Calculadora(boolean isOn) {
		this.isOn = isOn;
	}

	public int suma(int a, int b) {
		return a + b;
	}

	public int resta(int a, int b) {
		return a - b;
	}

	public int multiplicacion(int a, int b) {
		return a * b;
	}

	public double division(int a, int b) {

		if (b == 0) {
			throw new ArithmeticException("No puedes dividir entre 0");
		}

		return a / b;
	}

	// getters && setters
	public boolean isOn() {
		return isOn;
	}

}
