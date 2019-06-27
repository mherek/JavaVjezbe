package edunova;

public class Nizovi {
	
	public static void main(String[] a) {
		//varijabla
		int i=10;
		//niz integera 
		//12 elemenatata
		//1. element se nalazi na mjestu s indeksom 0
		//itd.
		int[] temperature=new int[12];
		
		
		System.out.println(temperature[0]);
		
		
		temperature[0]=1;
		temperature[1]=4;
		//..
		temperature[11]=2;
		
		//niz nije primitivni tip, ima metode i svojstva
		//temperature.
		
		//drugi naèin deklariranja
		int niz[]= {1,2,3,2,7};
		//ispišite 1. element niza
		System.out.println(niz[0]);
		
		//ispisšite zadnji element niza
		// ne znate koliko ima elemenata
		System.out.println(niz[niz.length-1]);
		
		
		
	}

}
