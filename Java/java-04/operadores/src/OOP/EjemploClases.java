package OOP;

public class EjemploClases {
	static void cambio() {
		Tabla tabla1=new Tabla();
		OperacionesAritmeticas oa=new OperacionesAritmeticas();
				//
				Menu m=new Menu();
				int numero=m.menuOp();
				switch (numero) {
				case 1: {
					tabla1.tablas();
					break;
				}
				case 2:{
					oa.add();
				}
				case 3:{
					break;
				}
				default:
					}
	}
	public static void main(String[] args) {
		EjemploClases.cambio();
	}
}
