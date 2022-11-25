package mis_clases.colecciones.coleccionesOp;
import java.util.*;
public class claseColecciones {
	
	public static void main(String[] args) {
		ArrayList<String> lista=new ArrayList<String>();
		lista.add("A");
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.add("E");
		
		System.out.println("ArrayList: "+lista);
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "A");
		hm.put(1, "X");
		hm.put(10, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		
		System.out.println("HashMap: "+hm);
		System.out.println("HashMap get "+hm.get(1));
		System.out.println("HashMap get "+hm.get(4));
	}
	}

