package polimorfismo;
import java.util.*;
public abstract class FigurasGeometricas {
	protected double pValor;
	protected double sValor;
	protected double resultado;

	Scanner S;
	
	public abstract void pedirDatos();
	public abstract void area();
	
	public void visualizar() {
		area();
		System.out.println("El resultado es: "+resultado);
	}
}
