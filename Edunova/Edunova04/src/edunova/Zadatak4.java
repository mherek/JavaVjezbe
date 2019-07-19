package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {

	//program unosi dva cijela broja
	//ispisuje sve parne brojeve između njih
	
	public static void main(String[] args) {
		int odKuda = Integer.parseInt(JOptionPane.showInputDialog("OD"));
		int doKuda = Integer.parseInt(JOptionPane.showInputDialog("DO"));
		
		
		
		int poc = odKuda<=doKuda ? odKuda : doKuda;
		int kraj = doKuda>=odKuda ? doKuda : odKuda;
		
//		if(odKuda<=doKuda) {
//			poc=odKuda;
//		}else {
//			poc=odKuda;
//		}
		
		for(int i=poc;i<=kraj;i++) {
			if(i%2==1) {
				continue; //preskakanje
			}
			
			System.out.println(i);
		}
		
		
		
		
	}
	
}
