package polimorfismo;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas{
	
	public Rectangulo() {
		super();
		pedirDatos();
	}
	
	@Override
	public void pedirDatos() {
		S=new Scanner(System.in);
		System.out.println("Introduca primer valor:");
		pValor=S.nextDouble();
		System.out.println("Intoduzca el segundo valor");
		sValor=S.nextDouble();
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		resultado=(pValor*sValor);
	}
	
}
