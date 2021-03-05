package modul1;

import javax.swing.JOptionPane;

public class N1f2 {

	public static void main(String[] args) {
		final int ANY_TRASPAS = 1948;
		final int PERIODE_TRASPAS = 4;
		final int ANY_NEIXAMENT = 1968;
		int anysTraspas;

		anysTraspas = (ANY_NEIXAMENT-ANY_TRASPAS)/PERIODE_TRASPAS;
		//provant JOptionPane enlloc de System.out.println()
		JOptionPane.showMessageDialog(null, "Van haver-hi " + anysTraspas +" anys de traspàs des de 1948 fins l'any que vaig nèixer");
	}
}