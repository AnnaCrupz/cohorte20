package colecciones;

public class Persona {
	//atributos
	String nombre;
	int edad;
	
	//constructor
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " nombre: "+this.nombre+" edad: "+this.edad;
	}
}
