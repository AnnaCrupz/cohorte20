package OOP;

import java.util.*;

public class OperacionesAritmeticas {
	Scanner scanner=new Scanner(System.in);
	int i=0;

		
	void add() {
		do {
		switch (i) {
		case 1:
			System.out.println("Da el numero 1 Suma");
			var valor0Suma=scanner.nextInt();
			System.out.println("Da el numero 2 Suma");
			var valor1Suma=scanner.nextInt();
			int suma=valor0Suma+valor1Suma;
			System.out.println("La suma es "+suma);
			break;
		case 2:
			System.out.println("Da el numero 1 Resta");
			var valor0Resta=scanner.nextInt();
			System.out.println("Da el numero 2 Resta");
			var valor1Resta=scanner.nextInt();
			int resta=valor0Resta-valor1Resta;
			System.out.println("La resta es "+resta);
			break;
		case 3:
			System.out.println("Da el numero 1 Multiplicacion");
			var valor0Multiplicacion=scanner.nextInt();
			System.out.println("Da el numero 2 Multiplicacion");
			var valor1Multiplicacion=scanner.nextInt();
			int multiplicacion=valor0Multiplicacion*valor1Multiplicacion;
			System.out.println("La multiplicación es "+multiplicacion);
			break;
		case 4:
			System.out.println("Da el numero 1 Division");
			var valor0Division=scanner.nextInt();
			System.out.println("Da el numero 2 Division");
			var valor1Division=scanner.nextInt();
			try {
				int division=valor0Division/valor1Division;
				System.out.println("La division es "+division);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error: Division entre 0");
			}
			break;
		case 5:
			System.out.println("Da el numero 1 Modulo");
			var valor0Modulo=scanner.nextInt();
			System.out.println("Da el numero 2 Modulo");
			var valor1Modulo=scanner.nextInt();
			try {
				int modulo=valor0Modulo%valor1Modulo;
				System.out.println("El modulo es "+modulo);
				if (modulo==0) {
					System.out.println("Es par");
				}else {
					System.out.println("Es impar");
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error: Division entre 0");
			}
			break;
		case 6:
			System.out.println("Se ha terminado");
			break;
		default:
			System.out.println("Opcion no encontrada");
			break;
		}
	} while (i!=6);
	}
}
