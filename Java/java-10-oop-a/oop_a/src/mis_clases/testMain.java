package mis_clases;
import mis_clases.Clase_3;
import mis_clases.clase_2.Clase_2;
public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase_3 nc3=new Clase_3();
		System.out.println(nc3.toString());
		
		Clase_2 c2=new Clase_2(10,"Juan","24");
		c2.visualizar();
	}

}
