package modul2;

import java.util.ArrayList;
import java.util.Arrays;

public class N1f4 {

	public static void main(String[] args) {
		ArrayList<Character> name = new ArrayList<Character>(Arrays.asList('j', 'o', 'r', 'd', 'i'));
		ArrayList<Character> surName = new ArrayList<Character>(Arrays.asList('v', 'i', 'l', 'l', 'a', 'r'));
		ArrayList<Character> fullName = new ArrayList<Character>();
		fullName.addAll(name);
		fullName.add(' ');
		fullName.addAll(surName);
		name=null;
		surName=null;
		System.out.println("fullName:" +  fullName);
		System.out.println(name);
		System.out.println(surName);
	}
	
}
