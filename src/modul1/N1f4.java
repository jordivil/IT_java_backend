package modul1;

public class N1f4 {

	public static void main(String[] args) {
		String nom, cognom1, cognom2, nomComplert, dataNeixament;
		int dia, mes, any;
		nom = "Jordi";
		cognom1 = "Villar";
		cognom2 = "Espàrrech";
		dia = 2;
		mes = 9;
		any = 1968;
		nomComplert = nom + " " + cognom1 + " "  + cognom2;
		dataNeixament = dia + "/" + mes + "/" + any;
		System.out.println("El meu nom: " + nomComplert);
		System.out.println("La meva data de neixament: " + dataNeixament);
		if (any%4==0) {
			System.out.println("Vaig nèixer en any de traspàs");
		}
	}
}