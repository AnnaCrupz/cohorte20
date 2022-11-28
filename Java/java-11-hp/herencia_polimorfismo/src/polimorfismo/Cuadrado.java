package polimorfismo;

import java.util.Scanner;

public class Cuadrado extends FigurasGeometricas{
	
	public Cuadrado() {
		super();
		pedirDatos();
	}
	
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		S=new Scanner(System.in);
		System.out.println("Introduca el valor del lado:");
		pValor=S.nextDouble();
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado=pValor*pValor;
	}
	
}
