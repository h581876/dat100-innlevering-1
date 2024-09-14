package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class O3 {

	public static void main(String[] args) {

		String heltTall = showInputDialog("Heltall: ");
		int n = parseInt(heltTall);

		if (n < 0) {
			System.out.println("Ikke definert for negative tall");
		} else {

			int factorial = 1;

			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}

			System.out.println("Fakultet av " + n + " er: " + factorial);
		}

	}
}
