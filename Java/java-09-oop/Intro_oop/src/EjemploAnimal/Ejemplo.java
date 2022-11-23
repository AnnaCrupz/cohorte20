package EjemploAnimal;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1=new Animal("Falcon");
		animal1.setEdad(18);
		System.out.println("El nombre es: "+animal1.getNombre());
		System.out.println("Tiene "+animal1.getEdad()+" años.");
		animal1.setRaza("europeo domestico");
		System.out.println(animal1.toString());
	}

}
