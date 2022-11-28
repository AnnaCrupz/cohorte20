package polimorfismo;

import java.util.Scanner;

public class Circulo extends FigurasGeometricas {
	protected double pi=Math.PI;
	
	public Circulo() {
		pedirDatos();
	}
	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		System.out.println("Ingresa el radio del circulo: ");
		S=new Scanner(System.in);
		pValor=S.nextDouble();
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado=pi*(pValor*pValor);
	}

}
