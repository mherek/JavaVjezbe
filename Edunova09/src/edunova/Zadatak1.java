package edunova;

public class Zadatak1 {

	
	public static void main(String[] args) {
		
		int[] niz = new int[2];
		int i=0,j=1;
		
		niz[0]=++i;//1
		niz[1]=j--;//1
		
		System.out.println(++niz[0] - niz[1]++);
		
		
		
	}
}
