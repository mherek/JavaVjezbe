package edunova;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Mapa {
	
	public Mapa() {
		
		Map<String, Osoba> podaci = new HashMap<>();
		
		//od jave 10
		//var pero = new HashMap<String, Osoba>();
		
		podaci.put("O1", new Osoba("Pero","Perić"));
		podaci.put("O1", new Osoba("Maja","Mrak"));
		
		for (String s : podaci.keySet()) {
			System.out.println(podaci.get(s).getIme());
		}
		
		
		Map<String,String> mapa = new Hashtable<String, String>();
		
		mapa.put("O1","1");
		mapa.put("O2","1");
		
		for(String s : mapa.keySet()) {
			System.out.println(mapa.get(s));
		}
		
		//https://stackoverflow.com/questions/40471/differences-between-hashmap-and-hashtable
		
		
		
	}
	
	public static void main(String[] args) {
		new Mapa();
	}

}
