package herek.LjetniZadatak;

import javax.swing.JOptionPane;

public class Kontrola {

	public static String unosString (String poruka) {
		String s;
		while(true) {
			s=JOptionPane.showInputDialog(poruka);
			
			if(s.trim().length()==0) {
				JOptionPane.showConfirmDialog(null, "Obavezan unos");
				continue;
			}
			return s;
		}
	}
	public static int unosInt (String poruka) {
		int i;
		while(true) {
			try {
				i=Integer.parseInt(JOptionPane.showInputDialog(poruka));
				if(i<=0) {
					JOptionPane.showConfirmDialog(null, "Broj mora biti veci od nule!");
					continue;
				}
				return i;
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Unesi broj!");
			}
			
		}
	}
}
