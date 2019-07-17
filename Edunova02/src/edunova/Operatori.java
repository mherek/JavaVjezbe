package edunova;

public class Operatori {

	
	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		
		//u jedsnoj liniji deklarirao i dodjelio
		//više varijabli istog tipa
		int i = 5, j=9;
		
		//aritmetièki operatori
		System.out.println(j>i);
		System.out.println(i==j); // = je operator dodjeljivanje
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j); //0 zato što je rezultat interpretiran kao cijeli broj
		
		i=10;j=2;
		int z = i/j;
		System.out.println(z);
		
		//ostatak nakon cjelobrojnog djeljenja
		System.out.println(9%2);
		System.out.println(10%2);
		
		
		//operator nadoljepljivanja
		System.out.println(2+3); //zbrojiti æe
		System.out.println("2"+3); //nadoljepiti æe
		System.out.println("Prvi" + "drugi");
		
	}
}

