package edunova;

import java.util.ArrayList;
import java.util.List;

public class ObradaPogresaka {

	public ObradaPogresaka() {
		
		List<String> lista = new ArrayList<>();
		
		try {
			//1. izvodi se try (uvijek)
			lista.add(null);
			lista.add(null);
			System.out.println(lista.get(1).substring(0,2));
			
		}catch(IndexOutOfBoundsException e) {
			//2. obrađuje se uhvaćena iznimka
			System.out.println("Element ne postoji");
		}catch(NullPointerException e) {
			System.out.println("element nije definiran");
		}catch(Exception e) {
			System.out.println("Nepoznata greška " + e.getMessage());
		}finally {
			//3. uvijek se izvodi bez obzira dogodila se iznimka ili ne
			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new ObradaPogresaka();
		
	}
	
}
