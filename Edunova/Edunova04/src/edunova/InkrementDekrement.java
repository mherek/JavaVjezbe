package edunova;

public class InkrementDekrement {
	
	public static void main(String[] args) {
		int i=0;
		
		//samouveæavanje vrijednosti varijable
		i=i+1; // prvo se izraèuna desna strana pa dodjeli ljevoj
		
		i+=1; //ekvivalent gornjem izrazu - uveæa za 1
		
		i+=3; // uveæati za 3
		
		i++; //uveæava za 1 - inkrement
		
		//kod inkrementa postoji razlika BITNA
		++i;
		
		System.out.println(i);
		
		//prvo uveæa pa koristi
		System.out.println(++i);
		
		//prvo koristi pa uveæa
		System.out.println(i++);
		
		System.out.println(i);
		
		//dekrement
		
		--i;
		i--;
		
		//domaæa zadaæa
		//BEZ IZVOÐENJA NA RAÈUNALU naæi rezultat
		
		int t=2,k=3;
		t=k--; //t = 3, k=2
		k+=++t; //k = 2+4, t = 4
		k++;t--;// k=7, t=3
		t=--k+ ++t; //k=6, t = 10
		System.out.println(t++ + " - " + --k);
		
		
		
		
		
		
		
	}

}
