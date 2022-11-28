package com.herencia;

public class Hija extends Padre{
	private int edad;
	private String apellidos;
	private String apellido;


	public Hija(String nombre, String domicilio, int edad) {
		super(nombre, domicilio);
		this.edad = edad;
	}
	


	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}

	

	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"apellido "+ apellidos +" edad: "+edad;
	}



	public void mostrarDatos(String apellido) {
		// TODO Auto-generated method stub
		super.mostrarDatos();
		System.out.println("su apellido es: "+apellido+" la edad es: "+this.getEdad());
	}
	
	
	
}
