package modul1;

public class N3metode {

	public static void main(String[] args) {
		int temporal = 0;
		int[] elsNombres = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int elements = elsNombres.length;
		
		// recorrem array inicial amb mètode static
		pintaNumeros(elsNombres);
		
		// invertim l'array
		for (int i = elements; i > 0; i--) {
			elsNombres[temporal] = i;
			temporal++;
		}
		
		// recorrem array final amb mètode static
		pintaNumeros(elsNombres);
	}

	private static void pintaNumeros(int[] numeros) {
		for (int numero:numeros) {
			System.out.println(numero);
		}
	}
}
