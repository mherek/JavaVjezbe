package vjezbe;

public class Nasljedivanje extends Enkapsulacija {
	public Nasljedivanje() {

	}

	private String ime;
	private String prezime;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Nasljedivanje(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	private String nadimak;

	public String getNadimak() {
		return nadimak;
	}

	public void Nasljedivanje(String nadimak) {
		this.nadimak = nadimak;
	}

	boolean Nasljedio;

	public boolean isNasljedio() {
		return Nasljedio;
	}

	public void setNasljedio(boolean nasljedio) {
		Nasljedio = nasljedio;
	}

	@Override
	public String getTip() {
		return "Ja sam nasljednik";
	}
}
