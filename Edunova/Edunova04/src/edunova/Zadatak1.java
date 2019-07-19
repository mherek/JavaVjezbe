package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//Program unosi 2 cijela broja koja stavlja u niz
	public static void main(String[] args) {
	
		int[] niz = {
				Integer.parseInt(
						JOptionPane.showInputDialog("B1")
						),
				Integer.parseInt(
						JOptionPane.showInputDialog("B2")
						)
		};
		
		System.out.println(Arrays.toString(niz));
		
		
	}

}
