package src;
import javax.swing.JOptionPane;
public class Matrix {
	


		public static void main(String[] args) {
		int i=Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Broj stupaca"));
		int brojac=1;
		int maxr=i-1;
		int maxs=j-1;
		int minr=0;
		int mins=0;
			int matrica [][] = new int [i][j];
			while(brojac<(i*j)) {
	for(int a=maxs;a>=mins;a--) { // Ide lijevo
		matrica[minr][a]=brojac++;
	}
	if(brojac>(i*j)) {
		break;
	}
	for(int a=maxs;a>=mins;a--) {
		matrica[a][mins]=brojac++;	// Ide gore
	
	}
	if(brojac>(i*j)) {
		break;
	}
	for(int a=mins;a<=maxs;a++) {
		matrica[maxr][a]=brojac++;	// Ide desno
			
	}
	if(brojac>(i*j)) {
		break;
	}
	for(int a=mins;a<=maxs-1;a++) {
		matrica[minr][a]=brojac++;	//ide dolje
		
	}
	if(brojac>(i*j)) {
		break;
	}
	maxr--;
	maxs--;
	minr++;
	mins++;
			}		
			
			for(int a=0;a<i;a++) {
				for(int b=0;b<j;b++) {
					System.out.print(matrica[a][b]+ "    	");
					
				}
			System.out.println();
	}
				
				
		}
	}
		




