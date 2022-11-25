package mis_clases.excepciones.operacion;

public class Division {
	private int numerador, denominador;

	public Division(int numerador, int denominador) throws opExcep{
		if(denominador==0) {
			throw new opExcep("El denominador es 0");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public void visualizar() {
		System.out.println("Resultado de la division: "+this.numerador/this.denominador);
	}
	
}
