package OOP;
import java.util.*;
public class Tabla {
	Scanner scanner=new Scanner(System.in);
	 void tablas() {
		System.out.println("Introduzca el numero de tabla");
		int tabla2=scanner.nextInt();
		int j=0;
		while (j<=10) {
			System.out.println(tabla2+" * "+j+" = "+(tabla2*j));
			j++;
		} 
	}
			
}
