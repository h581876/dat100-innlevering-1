package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {

		// a og b)
		for (int i = 1; i <= 10; i++) {
			String poeng = showInputDialog("Poengsum: ");
			int poengsum = Integer.parseInt(poeng);

			if (poengsum <= 100 && poengsum >= 90) {
				System.out.println("Karakter A");
			} else if (poengsum <= 89 && poengsum >= 80) {
				System.out.println("Karakter B");
			} else if (poengsum <= 79 && poengsum >= 60) {
				System.out.println("Karakter C");
			} else if (poengsum <= 59 && poengsum >= 50) {
				System.out.println("Karakter D");
			} else if (poengsum <= 49 && poengsum >= 40) {
				System.out.println("Karakter E");
			} else if (poengsum <= 39 && poengsum >= 0) {
				System.out.println("Karakter F");
			} else {
				System.out.println("Ugyldig poengsum");
				i--; // c)
			}

		}

	}

}
