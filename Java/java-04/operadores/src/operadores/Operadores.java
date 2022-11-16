package operadores;
import java.util.*;
public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
//		System.out.println("Da un dato");
//		String dato=scanner.nextLine();
//		System.out.println("El dato es: "+dato);
//		
//		System.out.println("Da el numero 1 Suma");
//		var valor0Suma=scanner.nextInt();
//		System.out.println("Da el numero 2 Suma");
//		var valor1Suma=scanner.nextInt();
//		int suma=valor0Suma+valor1Suma;
//		System.out.println("La suma es "+suma);
//		
//		System.out.println("Da el numero 1 Resta");
//		var valor0Resta=scanner.nextInt();
//		System.out.println("Da el numero 2 Resta");
//		var valor1Resta=scanner.nextInt();
//		int resta=valor0Resta-valor1Resta;
//		System.out.println("La resta es "+resta);
//		
//		System.out.println("Da el numero 1 Multiplicacion");
//		var valor0Multiplicacion=scanner.nextInt();
//		System.out.println("Da el numero 2 Multiplicacion");
//		var valor1Multiplicacion=scanner.nextInt();
//		int multiplicacion=valor0Multiplicacion*valor1Multiplicacion;
//		System.out.println("La multiplicación es "+multiplicacion);
//		
//		
//		System.out.println("Da el numero 1 Division");
//		var valor0Division=scanner.nextInt();
//		System.out.println("Da el numero 2 Division");
//		var valor1Division=scanner.nextInt();
//		try {
//			int division=valor0Division/valor1Division;
//			System.out.println("La division es "+division);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Error: Division entre 0");
//		}
//		
//		System.out.println("Da el numero 1 Modulo");
//		var valor0Modulo=scanner.nextInt();
//		System.out.println("Da el numero 2 Modulo");
//		var valor1Modulo=scanner.nextInt();
//		try {
//			int modulo=valor0Modulo%valor1Modulo;
//			System.out.println("El modulo es "+modulo);
//			if (modulo==0) {
//				System.out.println("Es par");
//			}else {
//				System.out.println("Es impar");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Error: Division entre 0");
//		}
/*		int a=5;
		int b=3;
		var comparar= a>=b;
		System.out.println("valor comparar:"+comparar);
		var logica=false;
		System.out.println("valor logico: "+logica);
		if (comparar && logica) {
			System.out.println("Soy verdadero");
		} else {
			System.out.println("Soy falso");
		}
		
		if (comparar || logica) {
			System.out.println("comparar o lógica");
		} else {
			System.out.println("ambos falsos");
		}
		if (!logica) {
			System.out.println("Negativo de logica");
		} else {
			System.out.println("Logica es true");
		} */
		/*
		 */
		int i=0;
		do {
			System.out.println("Elige una opción: \n "
					+ "1. Suma \n "
					+ "2.Resta \n "
					+ "3.Multiplicación \n "
					+ "4.División \n "
					+ "5.Módulo \n "
					+ "6.Terminar");
			i=scanner.nextInt();
			String msj=" ";
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
