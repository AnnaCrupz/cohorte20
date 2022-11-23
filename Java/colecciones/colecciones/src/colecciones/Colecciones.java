package colecciones;
import java.util.*;
public class Colecciones {

	public static void main(String[] args) {
		// ArrayList 
		System.out.println("------ArrayList------");
		List<String> myArray=new ArrayList<String>();
		
		myArray.add("GDL");
		myArray.add("CDMX");
		myArray.add("MTY");
		myArray.add(1, "edomex");
		var elemento2=myArray.remove(1);
		System.out.println(myArray);
		System.out.println("Elemento eliminado: "+elemento2);
		System.out.println("Tamaño de array "+myArray.size());
		imprimir(myArray);
		
		System.out.println("-----Set-----");
		Set<String> miSet=new HashSet<String>();
		miSet.add("Pancho");
		miSet.add("Paco");
		miSet.add("Juan");
		miSet.add("Juan");
		miSet.add("Martin");
		
		var contiene=miSet.contains("Martin");
		miSet.remove("Juan");
		System.out.println("Contiene a Maria:"+contiene);
		imprimir(miSet);
		
		System.out.println("-----Map-----");
		HashMap<String,Integer> miMap= new HashMap<String,Integer>();
		miMap.put("valor uno", 1);
		miMap.put("valor dos", 2);
		miMap.put("valor tres", 4);
		miMap.put("valor tres", 3);
		System.out.println("Valor de la llave valor uno"+miMap.get("valor uno"));
		System.out.println("Valores de las llaves"+miMap.keySet());
		System.out.println(miMap);
		System.out.println("Valores individuales de Map");
		for(String llave : miMap.keySet()) {
			System.out.println(llave + " : " + miMap.get(llave));
		}

	}
	
	public static void imprimir(Collection coleccion) {
		for(Object elemento : coleccion ) {
			System.out.println("Elemento = " + elemento);
		}
	}


}
