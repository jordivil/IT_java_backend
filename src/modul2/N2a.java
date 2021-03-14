package modul2;

import java.util.Scanner;

public class N2a {

	public static void main(String[] args) {
		System.out.println("Introdueix un número:");
		Scanner entrada = new Scanner (System.in);
		int numero=entrada.nextInt();
		for (int linea=1; linea <= numero; linea++) {
			for (int contador = 1; contador < linea; contador++) {
				System.out.print(contador);
			}
			System.out.print(linea + "\n");
		}
		entrada.close();
	}

}
