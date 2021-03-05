package modul1;

public class N2 {

	public static void main(String[] args) {
		double valor = 3.5646d;
		int  variableInt;
		float variableFloat;
		String variableString;
		variableInt = (int) valor;
		variableFloat = (float) valor;
		variableString = String.valueOf(valor);
		System.out.println("Valor double inicial: " + valor);
		System.out.println("Valor int: " + variableInt);
		System.out.println("Valor float: " + variableFloat);
		System.out.println("Convertit a string: " + variableString);
	}

}
