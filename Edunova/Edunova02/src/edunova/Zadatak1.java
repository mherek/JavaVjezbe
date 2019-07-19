package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {

	// komentar jedna linija
	
	/*
	  
	  komentar više linija
	  
	  */
	
	//Program unosi dva broja i ispisuje ih
	// jedno pored drugog odvojeno zarezom
	public static void main(String[] args) {
		
		//moguæe je u jednj liniji deklarirati više varijabli
		// istog tipa
		int i,j;
		
		i=Integer.parseInt(
				JOptionPane.showInputDialog("B1")
				);
		j=Integer.parseInt(
				JOptionPane.showInputDialog("B2")
				);
		
		System.out.print(i);
		System.out.print(",");
		System.out.print(j);
		
		
	}
	
}
