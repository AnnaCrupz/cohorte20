package live_coding2;

import java.util.*;

public class mcd_nm {
	Scanner s=new Scanner(System.in);
	int manzanas;
	int mangos;
	public mcd_nm() {
		System.out.println("Ingresa el numero de manzanas");
		this.manzanas=s.nextInt();
		System.out.println("Ingresa el numero de mangos");
		this.mangos = s.nextInt();
	}
	
	public int mcd() {
		int div=0;
		int menor=(this.manzanas<this.mangos)?this.manzanas:this.mangos;
		for (int i = 1; i < menor; i++) {
			if(this.manzanas%i==0 && this.mangos%i==0) {
				if (i>div) {
					div=i;
				}
			}
		}
		return div;
		
		
		
	}
	public int getManzanas() {
		return manzanas;
	}

	public void setManzanas(int manzanas) {
		this.manzanas = manzanas;
	}

	public int getMangos() {
		return mangos;
	}

	public void setMangos(int mangos) {
		this.mangos = mangos;
	}

	public void visualizar() {
		System.out.println("El numero de cajas es: "+this.mcd());
		System.out.println("El número de mangos en una caja es: "+(this.getMangos()/this.mcd()));
		System.out.println("El numero de naranjas en una caja es: "+(this.getManzanas()/this.mcd()));
	}
	
}
