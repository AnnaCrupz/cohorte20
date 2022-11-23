package colecciones;

import java.util.Arrays;
import java.util.Iterator;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				String [] miArreglo=new String[5];
				miArreglo[0]="Ana1";
				miArreglo[1]="Ana2";
				miArreglo[2]="Ana3";
				miArreglo[3]="Ana4";
				miArreglo[4]="Ana5";
				System.out.println("--------------for--------------");
				for (int i = 0; i < miArreglo.length; i++) {
					System.out.println(miArreglo[i]);
				}
				System.out.println("----------Foreach-----------");
				for (String string : miArreglo) {
					System.out.println(string);
				}
				System.out.println("--------------.toString--------------");
				System.out.println(Arrays.toString(miArreglo));

			System.out.println("-----Arrays int cast y parse-----");
			int [] numeros =new int[4];
			numeros[0]=1;
			numeros[1]=-56;
			numeros[2]=(int) 2.52;
			numeros[3]=Integer.parseInt("2");
			
			for (int i = 0; i < numeros.length; i++) {
				System.out.println(numeros[i]);
			}
			Persona persona1=new Persona("Juan",18);
			System.out.println(persona1.toString());
			Persona persona2=new Persona("Juan",18);
			
			Persona [] arrPersonas=new Persona[3];
			arrPersonas[0]=persona1;
			arrPersonas[1]=persona2;
			arrPersonas[2]=new Persona("Luis",22);
			
			System.out.println("------------arreglo persona ----------");
			for (int i = 0; i < arrPersonas.length; i++) {
				Persona persona = arrPersonas[i];
				System.out.println(persona);
			}
			System.out.println("-------Arreglo literal--------");
			//Arreglos literales
			String [] arrString= {"Manzana","Pera","Sandia","Guayaba"};
			for (String string : arrString) {
				System.out.println(string);
			}
}
}



