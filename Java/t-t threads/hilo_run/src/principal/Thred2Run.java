package principal;

import hilo_run.MiEjecutable;

public class Thred2Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread [] t =new Thread[4];
		MiEjecutable [] o=new MiEjecutable[4];
		for (int i = 0; i < o.length; i++) {
			 o[i]=new MiEjecutable(i);
			 t[i]=new Thread(o[i]);
			 
			 System.out.println("Nuevo hilo"+t[i]);
			
		}
		for (int i = 0; i < 4; i++) {
			t[i].start();
			
		}
		for (int i = 0; i < 4; i++) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int j = 0; j < 4; j++) {
				o[i].visualizar();
			}
			
		}
	}

}
