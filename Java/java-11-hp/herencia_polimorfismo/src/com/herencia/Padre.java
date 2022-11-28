package com.herencia;

public class Padre {
	protected String nombre;
	protected String domicilio;
	
	
	public Padre(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public void mostrarDatos() {
		System.out.println("Tu nombre es: "+this.getNombre()+" domicilio: "+this.getDomicilio());
	}


	@Override
	public String toString() {
		return this.getClass()+"[nombre=" + nombre + ", domicilio=" + domicilio + "]";
	}
	
	
}
