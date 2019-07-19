package skener;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Start {
	private List<Osoba> osobe;

	public Start() {
		Scanner sc = new Scanner(System.in);
		osobe = new ArrayList<>();
		glavna_petlja: while (true) {
			izbornik();
			System.out.println("Odaberite radnju");
			switch (sc.nextInt()) {
			case 5:
				break glavna_petlja;
			case 1:
				izslistajOsobe();
				break;
			case 2:
				osobe.add(unosOsobe());
				break;
			case 3:
				promjenaOsobe();
				break;
			case 4:
				brisanjeOsobe();

			default:
				break;
			}
		}

	}

	private void brisanjeOsobe() {
		izslistajOsobe();
		osobe.remove(redniBrojOsobe() - 1);

	}

	private int redniBrojOsobe() {
		int rb = sc.nextInt();
		while (true) {
			if (rb > osobe.size()) {
				System.out.println("Obavezno odabir ponuðenih rednih brojeva");
				continue;
			}
			return rb;
		}
	}

	private void promjenaOsobe() {
		izslistajOsobe();
		Osoba o = osobe.get(redniBrojOsobe() - 1);
		o = postaviVrijednosti(o);

	}

	private Osoba unosOsobe() {
		Osoba o = new Osoba();
		o = postaviVrijednosti(o);
		return o;

	}

	private Osoba postaviVrijednosti(Osoba o) {
		System.out.println("Unesite ime");
		o.setIme(sc.nextString());
		System.out.println("Unesite prezime");
		o.setPrezime(sc.nextString());
		System.out.println("Unesite visinu");
		o.setVisina(sc.nextInt());
		System.out.println("Unesite datum rodenja");
		o.setDatumrodenja(sc.nextDate());
		return o;

	}

	private void izbornik() {
		System.out.println("??? Konzolna aplikacija ???");
		System.out.println("1. Izlistaj sve osobe");
		System.out.println("2. Unos nove osobe");
		System.out.println("3. Promjena osobe");
		System.out.println("4. Brisanje osobe");
		System.out.println("5. Izlaz iz programa");

	}

	private void izslistajOsobe() {
		System.out.println("\nIspis osoba");
		int i = 1;
		for (Osoba osoba : osobe) {
			System.out.println(i++ + ". " + osoba);

		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		new Start();
	}
}
