package mis_clases.clase_2;

public class Clase_2 extends ClasePadre{
	String dato1;

	public Clase_2(int valor0, String dato0, String dato1) {
		super(valor0, dato0);
		this.dato1=dato1;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		super.visualizar();
		System.out.println(dato1);
	}
	

}
