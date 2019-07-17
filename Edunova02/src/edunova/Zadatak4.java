package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {

	// Program prima 2 broja i ispisuje razliku

	// primjer ispisa za brojeve 4.5 i 2
	// 4.5 - 2.0 = 2.5

	public static void main(String[] args) {

		double a = Double.parseDouble(JOptionPane.showInputDialog("B1"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("B2"));

		double r = a - b;

		System.out.println(a + " - " + b + " = " + r);

	}
}
