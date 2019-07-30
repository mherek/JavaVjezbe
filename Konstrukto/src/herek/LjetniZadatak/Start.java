package herek.LjetniZadatak;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Start {
	private Connection connection;
	private List<Radnik> radnici;

	public Start() {
		radnici = new ArrayList<Radnik>();
		connection = Baza.getConnection();

		petlja: while (true) {
			izbornik();
			switch (Kontrola.unosInt("Odaberite radnju")) {
			case 1:
				unosOsobe();
				break;
			case 2:
				izlistajOsobe();
				break;
			case 3:
				izmjenaOsobe();
				break;
			case 4:
				// brisanjeOsobe();
				break;
			case 5:

				break;
			case 7:
				break petlja;
			default:
				break;
			}
		}

	}

	private void izmjenaOsobe() {
		izlistajOsobe();
		Radnik r = radnici.get(redniBrojOsobe() - 1);
		r=postaviVrijednosti(r);
	}

	private void izlistajOsobe() {
		System.out.println("\n Ispis osoba");
		int i = 1;
	for (Radnik radnik : radnici) {
		System.out.println(i++ + "." + radnik);
	}
	System.out.println("");

		}

	

	private int redniBrojOsobe() {
		int rb;
		while (true) {
			rb = Kontrola.unosInt(" Unesite redni broj");
			if (rb > radnici.size()) {
				JOptionPane.showConfirmDialog(null, " Obavezan odabir ponudenih brojeva");
				continue;
			}
			return rb;
		}
	}

	private Radnik unosOsobe() {
		Radnik r = new Radnik();
		r = postaviVrijednosti(r);
		return r;
	}

	private Radnik postaviVrijednosti(Radnik r) {
		r.setIme(Kontrola.unosString(" Unesite ime "));
		r.setPrezime(Kontrola.unosString(" Unesite prezime"));
		r.setIban(JOptionPane.showInputDialog("Unesite iban")); // Napraviti kontrolu za provjeru iban-a
		r.setOib(JOptionPane.showInputDialog(" Unesite OIB")); // Provjeru OIB-a
		r.setNadredeni(Kontrola.unosInt(" Unesite sifru nadredenog"));
		return null;
	}

	private void izbornik() {
		System.out.println("Konstrukto!");
		System.out.println("1. Unos nove osobe");
		System.out.println("2. Pregled svih unesenih osoba");
		System.out.println("3. Izmjena dodane osobe");
		System.out.println("4. Brisanje postojece osobe");
		System.out.println("5. ERA");
		System.out.println("6. Github");
		System.out.println(" 7. Izlaz ");
	}

	public static void main(String[] args) {
		new Start();
	}

}
