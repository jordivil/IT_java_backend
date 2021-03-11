package modul1;

public class N1f3 {

	public static void main(String[] args) {
		int anyInicialTrespas = 1948;
		final int PERIODE_TRASPAS = 4;
		final int ANY_NEIXAMENT = 1968;
		final String esAnyDeTrespas = "\nEl vostre any de neixament és any de trespàs";
		final String noEsAnyDeTrespas = "\nEl vostre any de neixament no és any de trespàs";
		boolean neixamentDeTrespas = ANY_NEIXAMENT%4 ==0;
		
		System.out.println("Anys de trespàs fins a l'any de neixament:\n ");
		for (int any=anyInicialTrespas; any <= ANY_NEIXAMENT; any+=PERIODE_TRASPAS) {
			System.out.println("\t" + any);
		}
		if (neixamentDeTrespas == true) {
			System.out.println(esAnyDeTrespas);
		} else {
			System.out.println(noEsAnyDeTrespas);
		}
	}
}