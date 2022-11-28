package ejecutarAbs;

import java.util.Scanner;

import polimorfismo.*;

public class EjecutarABS {
	
	
	public static void main(String[] args) {
		int select;
		Scanner S=new Scanner(System.in);
		System.out.println("Selecciona una figura"
				+ "\n 1.Triangulo"
				+ "\n 2.Cuadrado"
				+ "\n 3.Circulo"
				+ "\n 4.Rectangulo");
		select=S.nextInt();
		switch (select) {
		case 1: {
			FigurasGeometricas t1=new Triangulo();
			t1.visualizar();
			break;
		}
		case 2:{
			FigurasGeometricas c1=new Cuadrado();
			c1.visualizar();
			break;
		}
		case 3:{
			FigurasGeometricas cir1=new Circulo();
			cir1.visualizar();
			break;
		}
		case 4:{
			FigurasGeometricas r1=new Rectangulo();
			r1.visualizar();
			break;
		}

		}
	}
}

