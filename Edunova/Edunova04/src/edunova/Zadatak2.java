package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	//program unosi broj ocjena
	//nakon toga u niz unosi vrijednost za svaku ocjenu
	//ispisuje prosjek ocjena

	public static void main(String[] args) {
		int ukupanBrojPredmeta = 
				Integer.parseInt(JOptionPane.showInputDialog("B"));
		
		int[] niz = new int[ukupanBrojPredmeta];
		
		for(int i=0;i<ukupanBrojPredmeta;i++) {
			niz[i]=Integer.parseInt(JOptionPane.showInputDialog("O"));
		}
		System.out.println(Arrays.toString(niz));
		
		int zbroj=0;
		for(int i=0;i<niz.length;i++) {
			zbroj+=niz[i];
		}
		System.out.println(zbroj/(float)ukupanBrojPredmeta);
		
	}

}
