package edunova;

public class PrekidanjeNastavljanjePetlje {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			//petlju nasilno prekidamo s break
			
			if(i>20) {
				break;
			}
			
			if(i==3 || i==5) {
				continue;
			}
			
			System.out.println(i);
		}
		
		
		//loš način
		for (int i = 0; i < 100; i++) {
			if(!(i==3 || i==5) && i<=20) {
				System.out.println(i);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		}
		
		
	}
}
