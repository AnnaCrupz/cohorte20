package mis_clases;

public class Clase_3 {
	private int valor=2357;
	
	

	public Clase_3() {
		
	}

	public Clase_3(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
	@Override
	public String toString() {
		return "Clase_3 [valor=" + valor + "]";
	}

	/*public static void main(String[] args) {
		Clase_3 obj3=new Clase_3();
		System.out.println(obj3.getValor());
		obj3.setValor(10);
		System.out.println(obj3.getValor());
		
	} */
	
}
