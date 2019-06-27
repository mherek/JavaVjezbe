package edunova;

public class UvjetnoGrananjeIf {
	
	public static void main(String[] args) {
	
		int i=0;
		
		boolean uvjet1 = i>=1;
		
		boolean uvjet2 = i<=5;
		
		
		System.out.println(uvjet1);
		System.out.println(uvjet2);
		
		//if radi s boolean tipom podatka
		if(uvjet1) {
			System.out.println("Ve�e je od 0");
		}
		
		//ista sintaksa lo�ije napisana
		//kada nema {} if se primjenjuje samo na prvu liniju nakon njega
		if(uvjet1)
			System.out.println("Ve�e je od 0");
			System.out.println("ne�tp");
		
		//ista funkcionalnost kao u prethodnim primjerima
		if(i>=1) {
			//true grana
			System.out.println("Ve�e je od 0");
		}else {
			//false grana
			System.out.println("Nije ve�e od 0");
		}
		
		//operator & - boolov operator and
		// provjerava oba uvjeta
		if(uvjet1 & uvjet2) {
			System.out.println("Ocjena je");
		}
		
		//operator && - uvjetovani and
		//u slu�aju ne zadovoljenja prvog uvjeta drugi se ne provjerava
		if(uvjet1 && uvjet2) {
			System.out.println("Ocjena je");
		}
		
		//ugnje��eno
		if(uvjet1) {
			if(uvjet2) {
				System.out.println("Ocjena je");
			}
		}
		
		//operator | - boolov operator ili
		if(uvjet1 | uvjet2) {
			System.out.println("Jedan je zadovoljen");
		}
		
		
		//operator || - uvjetovani ili
		//u slu�aju zadovoljenja prvog uvjeta drugi se ne provjerava
		if(uvjet1 || uvjet2) {
			System.out.println("Jedan je zadovoljen");
		}
		
		//operator ! - boolov operator not
		if(!uvjet1) {
			System.out.println("Prvi uvjet nije zadovoljen");
		}
		
		
		//inline if - tercijarni operator
		//u slu�aju da if i else izvode istu naredbu s razli�itim ishodom
		
		int p = 4;
		
		if(p%2==0) {
			System.out.println("Paran");
		}else {
			System.out.println("Neparan");
		}
		// nakon ? true, nakon : false
		System.out.println(p%2==0 ? "Parana" : "Neparan");
		
		
		
		
		
	}

}
