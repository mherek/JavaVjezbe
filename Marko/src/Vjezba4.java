package src;

import javax.swing.JOptionPane;

public class Vjezba4 {
public static void main(String[] args) {
	//U�itati dva broja ve�i se mno�i za 2 a manji dijeli sa 3
	int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi"));
	int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi"));
	
	
	if(a>b) {
		System.out.println((a*2) + "   "  + (b/3));
	}else {
		System.out.println((a/3) + "  "  +(b*2));
	}
}
}
