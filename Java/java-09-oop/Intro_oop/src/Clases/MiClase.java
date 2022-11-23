package Clases;

public class MiClase {
	private int atributo1=10;
	private String atributo2;
	private float atributo3;
	public MiClase(){
		
	}
	public MiClase(int atributo1,String atributo2,float atributo3){		//constructor
		this();
		this.atributo1=atributo1;
		this.atributo2=atributo2;
		this.atributo3=atributo3;
	}
	public void metodo1() {  //void
		System.out.println("Se logro");
	}
	double metodo2() {  //primitivo
		double a=0.0;
		return a;
	}
	public int getAtributo1() {
		return atributo1;
	}
	public String getAtributo2() {
		return atributo2;
	}
	public void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;
	}
	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MiClase("+"atributo1: "+atributo1+", atributo2:"+atributo2+')';
	}
}
