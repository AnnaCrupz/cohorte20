package Multiple;

public class Suma implements OperacionesAritmeticas, Operaciones{
	private double pValor;
	private double sValor;

	
	public Suma(double pValor, double sValor) {
		this.pValor = pValor;
		this.sValor = sValor;
	}

	@Override
	public double suma() {
		// TODO Auto-generated method stub
		return pValor+sValor;
	}

	

	@Override
	public void Mensajes() {
		// TODO Auto-generated method stub
		System.out.println("Hola soy una suma,"+"la suma de: "+pValor+"+"+sValor+"= "+suma());
	}

	@Override
	public double resta() {
		// TODO Auto-generated method stub
		return 0;
	}

}
