package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
	/*2.Izraèunati aritmetièku sredinu prirodnih brojeva od 1 do b koji nisu djeljivi sa 7. 
	*/
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		int i=1;
		boolean djeljiv = i/7!=0;
		int as=0;
			for(int j=1;j<a;j++) {
				if(djeljiv ) {
					as++;
		}
		System.out.println(as);
		}
	}
}

