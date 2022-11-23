package EjemploAnimal;

public class Animal {
	private String raza;
	private String nombre;
	private int edad;
	
	public Animal(String raza, String nombre, int edad) {
		// TODO Auto-generated constructor stub
		this.raza=raza;
		this.nombre=nombre;
		this.edad=edad;
	}
	public Animal(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getNombre() {
		return nombre;
	}
	public void nuevoNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Animal(Nombre: "+nombre+", raza:"+raza+", tiene:"+edad+" anios)";
	}
}
