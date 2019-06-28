import javax.swing.JOptionPane;

public class matrica {

	public static void main(String[] args) {
	int i=Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
	int j=Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
	int brojac=0;
	int maxr=i;
	int maxs=j;
	int minr=0;
	int mins=0;
		int matrica [][] = new int [i][j];
		while(brojac<i*j) {
			for(int a=maxr;a>=minr;a--) {
				matrica[i][mins]=brojac++;
				if(brojac>i*j) {
					break;
				}
						}
		
for(int a=maxs;a>=mins;a--) {
	matrica[maxr][a]=brojac++;
	if(brojac>i*j) {
		break;
	}
}
for(int a=maxr;a<maxr+maxr;a++) {
	matrica[a][maxs]=brojac++;
}
if(brojac>i*j) {
	break;
}
for(int a=maxs;a<maxs+maxs;a++) {
	matrica[maxr][a]=brojac++;
}
if(brojac>i*j) {
	break;
}

maxr--;
maxs--;
minr++;
mins++;

		}
		for(int a=0;i<i;a++) {
			for(int b=0;j<j;b++) {
				System.out.print(matrica[a][b]+ "	");
				
			}
		System.out.println();
}
			
			
	}
}
	


