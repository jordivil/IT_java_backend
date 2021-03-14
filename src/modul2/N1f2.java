package modul2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N1f2 {

	public static void main(String[] args) {
		ArrayList<Character> elMeuNom = new ArrayList<Character>();
		elMeuNom.add('j');
		elMeuNom.add('o');
		elMeuNom.add('r');
		elMeuNom.add('d');
		elMeuNom.add('i');
		for (char lletra : elMeuNom) {
			System.out.print(lletra);
			if (Character.isDigit(lletra)) {
				System.out.println(" Els noms de persones no contenen números");
			}else if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u') { //no he considerat majúscules
				System.out.println(" és vocal"); 
			} else {
				System.out.println(" és consonant");
			}
		}

		/*
		 *  Una altra possibilitat utilitzant Arrays.asList
		 */
		
		System.out.println("\nSegona solució\n");
		
		//Consulta al mentor: Voldria saber la diferència entre declarar amb List<Character> i ArrayList<Character>
		
		List<Character> unAltreNom = new ArrayList<Character>(Arrays.asList('j', 'o', 'r', '3', 'i'));
		for (char lletra : unAltreNom) {
			System.out.print(lletra);
			if (Character.isDigit(lletra)) {
				System.out.println(" Els noms de persones no contenen números");
			}else if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u') {
				System.out.println(" és vocal");
			} else {
				System.out.println(" és consonant");
			}
		}
	}
	
}
