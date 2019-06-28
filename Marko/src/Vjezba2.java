package src;

import javax.swing.JOptionPane;

public class Vjezba2 {

	public static void main(String[] args) {
		//.Prebrojati prirodne brojeve u intervalu od k do n koji su djeljivi sa a.
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Unesi djeliteljaj"));
		int poc = a<=b ? a : b;
		int kraj=a>=b ? a : b;
		for(int i=poc;i<kraj;i++) {
			if(i%c==0) {
				System.out.println(i);
			}
			
		}
	}

}
