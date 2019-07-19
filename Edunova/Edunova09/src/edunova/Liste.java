package edunova;

import java.util.ArrayList;
import java.util.List;

public class Liste {

	
	public Liste() {
		
		//niz
		Osoba[] osobe = new Osoba[2];
		//kreirajte dvije instance klase Osoba
		//dodjelite vrijednosti sebe i kolege do sebe
		//te ih postavite u niz
		
		Osoba ja = new Osoba();
		ja.setIme("Tomislav");
		ja.setPrezime("Jakopec");
		osobe[0]=ja;
		
		Osoba susjeda = new Osoba();
		susjeda.setIme("Jelena");
		susjeda.setPrezime("Klenkar");
		
		osobe[1]=susjeda;
		//ova lijeja je ekvivalent linijama 14-17
		osobe[0] = new Osoba("Tomislav", "Jakopec");
		osobe[1] = new Osoba("Jelena","Klenkar");
		
		//ispišite sva imena osoba u nizu
		//koristeæi foreach petlju
		for (Osoba osoba : osobe) {
			System.out.println(osoba.getIme());
		}
		
		// STARI NAÈIN RADA S LISTAMA
		ArrayList lista = new ArrayList();
		
		lista.add("Osijek");
		lista.add(susjeda);
		
		for (Object object : lista) {
			if(object instanceof String) {
				String s = (String) object; //cast
				System.out.println(s.substring(0,2));
			}
			if(object instanceof Osoba) {
				System.out.println(((Osoba)object).getPrezime());
			}
		}
		
		
		//OVAKO ÆEMO raditi s listama
		//s lijeve strane = je suèelje parametrizirano s generièkom klasom
		// s desne strane je implementacijska klasa
		List<Osoba> listaOsoba = new ArrayList<>();
		//proèitati https://dzone.com/articles/arraylist-vs-linkedlist-vs
		
		//dodati u listu osoba 100 osoba s imenima i prezimenima
		// ime1 ... ime 100, prezime1 ... prezime100
		Osoba o;
		for(int i=0;i<100;i++) {
			o=new Osoba();
			o.setIme("ime" + (i+1));
			o.setPrezime("prezime" + (i+1));
			listaOsoba.add(o);
			listaOsoba.add(new Osoba("ime" + (i+1), 
					"prezime" + (i+1)));
		}
		//ne možeš dodati ništa drugo do li instancu kalse Osoba
		//listaOsoba.add("");
		
		//ispišite ime prve osobe u listi
		System.out.println(listaOsoba.get(0).getIme());
		
		List<String> gradovi = new ArrayList<>();
		gradovi.add("Osijek");
		System.out.println(gradovi.get(0).substring(0,2));
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Liste();
	}
	
}
