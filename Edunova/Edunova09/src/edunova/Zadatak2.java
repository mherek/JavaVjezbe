package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	public Zadatak2() {
		
		//zadatak je unijeti broj
		
		int b;
		while(true) {
			try {
				b=
						Integer.parseInt(
								JOptionPane.showInputDialog(
										"Daj broj"));
				break;
			} catch (Exception e) {
				System.out.println("Niste unijeli broj");
			}
		}
		
		System.out.println(b);
		
		
	}
	
	public static void main(String[] args) {
		new Zadatak2();
	}

}
