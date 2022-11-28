package Multiple;

public class Resta implements OperacionesAritmeticas, Operaciones{
	private double pValor;
	private double sValor;

	
	public Resta(double pValor, double sValor) {
		this.pValor = pValor;
		this.sValor = sValor;
	}

	@Override
	public double suma() {
		return 0;
	
	}

	@Override
	public double resta() {
		// TODO Auto-generated method stub
		return pValor-sValor;
	}

	@Override
	public void Mensajes() {
		// TODO Auto-generated method stub
		System.out.println("Hola soy una resta,"+" la resta de: "+pValor+"-"+sValor+" = "+resta());
	}

}
