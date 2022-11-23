package operadores;

import java.util.*;

public class Ciclos {
	static void saludo() {
		System.out.println("Hola a las funciones en Java");
	}
	int operacion() {
		return 0;
	}
	float nuevo() {
		return 0;
	}
	String caracteres() {
		String nombre="hola";
		return nombre;
	}
	int operacion1() {
		int l=(int) Math.pow(0, 0);
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciclos objC=new Ciclos();
		var operacion=objC.operacion1();
		System.out.println(operacion);
		saludo();
		objC=new Ciclos();
		var name=objC.caracteres();
		System.out.println(name);
		objC.caracteres();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ingresa un número");
		int tabla=scanner.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(tabla+" * "+i+" = "+(tabla*i));
			
		}
		System.out.println("Ingresa un número");
		int tabla2=scanner.nextInt();
		int j=0;
		while (j<=10) {
			System.out.println(tabla2+" * "+j+" = "+(tabla2*j));
			j++;
		}
		
	}

}
