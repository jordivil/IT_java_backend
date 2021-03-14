package modul2;

import java.util.Scanner;

public class N2b {

	public static void main(String[] args) {
		System.out.println("Introdueix alçada piramide :");
		Scanner entrada = new Scanner(System.in);
		int altura = entrada.nextInt();
		
		for (int fila = 0; fila < altura; fila++) {
			
			for (int espais = 0; espais < fila; espais++) {
				System.out.print(" ");
			}
			
			for (int asteriscs = (altura-fila)*2; asteriscs > 1; asteriscs--) {
				System.out.print("*");
			
			}
			System.out.println("\n");
		}
		entrada.close();
	}

}
