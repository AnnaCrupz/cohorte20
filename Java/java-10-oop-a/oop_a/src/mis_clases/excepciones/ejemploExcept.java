package mis_clases.excepciones;

public class ejemploExcept {
	public static int dividir(int a,int b) {
		int r=0;
		try {
			
			r=a/b;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return r;
	}

	public static void main(String[] args) {
		System.out.println(dividir(10,0));
	}
	

}
