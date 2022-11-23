package Ejecutar;
import Clases.MiClase;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiClase nuevoObjeto=new MiClase(15,"Juan",.145f);
		nuevoObjeto.metodo1();
		System.out.println(nuevoObjeto.getAtributo1());
		
		System.out.println(nuevoObjeto.toString());
	}

}
