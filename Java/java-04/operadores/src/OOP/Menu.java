package OOP;

import java.util.Scanner;

public class Menu {
	
	int menuOp() {
		int numero;
		Scanner scanner=new Scanner(System.in);
		System.out.println("\t\t ----- Menu-----");
		System.out.println(" \t\t1: Tabla");
		System.out.println(" \t\t2: Operaciones Aritméticas");
		
		System.out.print(" introduzca la opcion: ");
		return numero=scanner.nextInt();

	}
	int subMenuOp() {
		System.out.println("Elige una opción: \n "
				+ "1. Suma \n "
				+ "2.Resta \n "
				+ "3.Multiplicación \n "
				+ "4.División \n "
				+ "5.Módulo \n "
				+ "6.Terminar");
		int i=scanner.nextInt();

	}
}

