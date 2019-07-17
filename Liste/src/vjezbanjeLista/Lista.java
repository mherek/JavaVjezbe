package vjezbanjeLista;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public Lista() {

		List<Osoba> lista = new ArrayList();
		Osoba o = new Osoba();
		o.setIme("Ja");
		o.setPrezime("Jos uvijek ja");
		lista.add(o);
		System.out.println(o.getIme() + o.getPrezime());
	}

	public static void main(String[] args) {
		new Lista();
	}
}
