package src;

import javax.swing.JOptionPane;

public class Vjezba3 {

	public static void main(String[] args) {
	//	2.Izraèunati aritmetièku sredinu prirodnih brojeva od 1 do b koji nisu djeljivi sa 7. 
int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
for(int i=1;i<b;i++) {
	if(i%7!=0) {
		System.out.println(i);
	}
}

	}

}
