package variables;

public class TipoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Tipos primitivos: byte, short,int, long de tipo entero
		System.out.println("-----------------byte-----------------");
		byte numeroB=127;
		System.out.println("El tamaño de un byte es "+Byte.SIZE);
		System.out.println("El tamaño de byte en bytes es "+Byte.BYTES);
		System.out.println("El valor maximo es "+Byte.MAX_VALUE);
		System.out.println("El valor minimo es "+Byte.MIN_VALUE);
		System.out.println("El valor de numeroB es "+numeroB);
		
		System.out.println("-----------------short-----------------");
		short numeroS=32767;
		System.out.println("El tamaño de un short es "+Short.SIZE);
		System.out.println("El tamaño de short en bytes es "+Short.BYTES);
		System.out.println("El valor maximo es "+Short.MAX_VALUE);
		System.out.println("El valor minimo es "+Short.MIN_VALUE);
		System.out.println("El valor de numeroS es "+numeroS);
		
		System.out.println("------------------int----------------");
		int numeroI=2147483647;
		System.out.println("El tamaño de un int es "+Integer.SIZE);
		System.out.println("El tamaño de int en bytes es "+Integer.BYTES);
		System.out.println("El valor maximo es "+Integer.MAX_VALUE);
		System.out.println("El valor minimo es "+Integer.MIN_VALUE);
		System.out.println("El valor de numeroB es "+numeroI);
		
		System.out.println("----------------long-----------------");
		long numeroL=32767000;
		System.out.println("El tamaño de un long es "+Long.SIZE);
		System.out.println("El tamaño de long en bytes es "+Long.BYTES);
		System.out.println("El valor maximo es "+Long.MAX_VALUE);
		System.out.println("El valor minimo es "+Long.MIN_VALUE);
		System.out.println("El valor de numeroL es "+numeroL);
		
		System.out.println("---------------------------------------");
		var numVar=10;
		System.out.println("Numero decimal "+numVar);
		var sistemaD=0b101;
		System.out.println("Numero en sistema binario "+sistemaD);
		var sistemaO=0101;
		System.out.println("Numero octal "+sistemaO);
		var sistemaH=0XAEC;
		System.out.println("Numero en hexadecimal "+sistemaH);

		
		System.out.println("---------------float-------------------");
		float numeroF=100.10F;
		System.out.println("El tamaño de un float es "+Float.SIZE);
		System.out.println("El tamaño EN BYTES es "+Float.BYTES);
		System.out.println("El valor maximo es "+Float.MAX_VALUE);
		System.out.println("El valor minimo es "+Float.MIN_VALUE);
		System.out.println("El valor de numeroF es "+numeroF);
		
		System.out.println("----------------double------------------");
		double numeroD=1000.10E23;
		System.out.println("El tamaño de un double es "+Double.SIZE);
		System.out.println("El tamaño de double en bytes es "+Double.BYTES);
		System.out.println("El valor maximo es "+Double.MAX_VALUE);
		System.out.println("El valor minimo es "+Double.MIN_VALUE);
		System.out.println("El valor de numeroD es "+numeroD);
		
		System.out.println("-----------------BOOLEAN-----------------");
		boolean estado=false;
		System.out.println("El valor de estado es "+estado);
		
		System.out.println("-----------------------------------------");
		System.out.println("Evaluando estado");
		if (estado==true) {
			System.out.println("Es verdadero");
		} else {
			System.out.println("Es falso");
		}
		
		System.out.println("---------Pureba lógica------------");
		var edad=18;
		var adulto= edad>=18;
		System.out.println(" varBool edad es "+adulto);
		if (edad>=18) {
			System.out.println("Es mayor o igual a 18");
		} else {
			System.out.println("Es menor de 18");
		}
		
		System.out.println("-----------char-------------");
		char caracter="halo".charAt(1);
		System.out.println("El caracter es: "+caracter);
		char caracterU='֎';
		System.out.println("El caracter UNICODE es: "+caracterU);
		char caracterU1='\u263A';
		System.out.println("El caracter UNICODE es: "+caracterU1);
	}

}
