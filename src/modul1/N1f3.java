package modul1;

public class N1f3 {

	public static void main(String[] args) {
		final int ANY_INICIAL_TRASPAS = 1948;
		final int PERIODE_TRASPAS = 4;
		final int ANY_NEIXAMENT = 1968;
		
		for (int any=ANY_INICIAL_TRASPAS; any <= ANY_NEIXAMENT; any+=PERIODE_TRASPAS) {
			System.out.println(any);
		}
	}

}