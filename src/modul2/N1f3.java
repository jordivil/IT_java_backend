package modul2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class N1f3 {
	public static void main(String[] args) {
		
		List<Character> unAltreNom = new ArrayList<Character>(Arrays.asList('j', 'o', 'r', 'd', 'i'));
		
		HashMap<Character, Integer> lletresDelNom = new HashMap<Character, Integer>();
		
		for (char lletra : unAltreNom) {
			if (lletresDelNom.containsKey(lletra)) {
				int quantitat = lletresDelNom.get(lletra);
				quantitat++;
				lletresDelNom.put(lletra,quantitat);
			} else {
			lletresDelNom.put(lletra, 1);
			}
		}
		System.out.println(lletresDelNom);
	}

}

