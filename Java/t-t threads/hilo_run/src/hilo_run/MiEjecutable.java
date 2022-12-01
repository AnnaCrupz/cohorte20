package hilo_run;

public class MiEjecutable implements Runnable {
	static long horaInicio = System.currentTimeMillis();
	int cont = 0;
	int num;

	public MiEjecutable(int numObjeto) {
		num = numObjeto;
	}

	public void run() {
		while (System.currentTimeMillis() - horaInicio < 3000) {
			System.out.print(num); // visualiza su número durante 3s.
			cont++; // cuenta el nº de visualizaciones
		}
	}

	public void visualizar() {
		System.out.println("Objeto num." + num + " - " + cont + " veces.");
	}
}
