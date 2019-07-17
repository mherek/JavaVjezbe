package src;

import javax.swing.JOptionPane;

public class Matrica2 {

	public static void main(String[] args) {
	int r=Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
	int s=Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
	int matrica [][] = new int [r][s];
	int b=1;
	int maxr=r-1;
	int maxs=s-1;
	int minr=0;
	int mins=0;
	
    while(b<=(r*s)){
		for (int i = maxr; i >= minr; i--){
			matrica[maxr][i] = b++;
			}
		if(b>(r*s)) {
			break;
		}
		for (int i = maxs-1; i >= mins; i--) {
			matrica[i][maxs] = b++;
			}
		if(b>(r*s)) {
			break;
		}
		for (int i = minr+1; i <= maxr; i++){
			matrica[i][minr] = b++;
			}
		if(b>(r*s)) {
			break;
		}
		for (int i = mins+1; i <= maxs-1; i++){
			matrica[mins][i] = b++;
			}
		if(b>(r*s)) {
			break;
		}
		mins++;
		minr++;
		maxs--;
		maxr--;
	        }
	

	for (int a = 0; a < r; a++) { 
		for (int c = 0; c < s; c++) {
			System.out.print(matrica[a][c] + "   ");
	}

}
}
}
