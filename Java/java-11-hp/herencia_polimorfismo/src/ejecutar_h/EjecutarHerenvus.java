package ejecutar_h;

import com.herencia.Hija;
import com.herencia.Padre;

public class EjecutarHerenvus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Padre npadre=new Padre("Juan","Jiloyork");
		npadre.mostrarDatos();
		
		Hija nhija=new Hija("Ana","Jiloyork",20);
		nhija.mostrarDatos();
		
		npadre=new Hija("Juan Carlos","México",21);
		System.out.println(npadre.toString());

		Hija h1= new Hija("Diego","México", 18);
		h1.toString();
		h1.mostrarDatos("Martinez");
		
		
	}

}
