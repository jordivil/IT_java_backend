package modul1;

public class N3 {

	public static void main(String[] args) {
		int temporal = 0;
		int[] elsNombres = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int elements = elsNombres.length;
		// recorrem array inicial
		System.out.println("Array inicial");
		for (int i = 0; i < elements; i++) {
			System.out.println(elsNombres[i]);
		}
		// invertim l'array
		for (int i = elements; i > 0; i--) {
			elsNombres[temporal] = i;
			temporal++;
		}
		// recorrem array per mostrar resultat
		System.out.println("Array final");
		for (int i = 0; i < elements; i++) {
			System.out.println(elsNombres[i]);
		}
	}
}
