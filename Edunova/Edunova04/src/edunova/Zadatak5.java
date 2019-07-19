package edunova;

public class Zadatak5 {
	
	//Za uneseni broj provjeriti da li je prosti ili ne
	
	
	public static void main(String[] args) {
		int b =5887;
		
		boolean prosti=true;
		for(int i=2;i<b;i++) {
			if(b%i==0) {
				System.out.println(i);
				prosti=false;
				break;
			}
		}
		if(prosti) {
			System.out.println(b  + " je prosti broj");
		}
		
		
		
	}

}
