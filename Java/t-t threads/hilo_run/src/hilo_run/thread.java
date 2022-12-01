package hilo_run;

public class thread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("hi");
		}
	}
}
