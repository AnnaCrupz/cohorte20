package mis_clases.excepciones.ejecuta;

import mis_clases.excepciones.operacion.Division;
import mis_clases.excepciones.operacion.opExcep;

public class TestExcep {
	
	public static void main(String[] args) {
		try {
			Division div=new Division(10,0);
			 div.visualizar();
		} catch (opExcep e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
 }
