package principal;

import hilo_run.thread;
import hilo_run.thread2;

public class ThreadTest {
	
	
	public static void main(String[] args) {
		thread hilo1=new thread();
		thread2 hilo2=new thread2();
		hilo1.start();
		hilo2.start();
		try {
			hilo1.join();
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Se han ejecutado los 2 trhead");
		
		
	}
}
