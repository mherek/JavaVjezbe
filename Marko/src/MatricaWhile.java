package src;

import javax.swing.JOptionPane;

public class MatricaWhile {

	public static void main(String[] args) {
			int r=Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
			int s=Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
			int matrica [][] = new int [r][s];
			int maxr=r;
			int maxs=s;
			int minr=0;
			int mins=0;
			int b=1;
			while(b<(r*s)) {
				while(r==maxr && s>mins ) {
					matrica[r][s--]=b++;
				}
				while()
				
				maxr--;
				maxs--;
				minr++;
				mins++;
			}

	}

}
