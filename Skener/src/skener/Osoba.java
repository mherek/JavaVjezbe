package skener;

import java.util.Date;

public class Osoba {

	private String ime;
	private String prezime;
	private int visina;
	private Date datumrodenja;
	

	public Osoba() {
	
	}
	
	public Osoba(String ime, String prezime, int visina, Date datumrodenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.visina = visina;
		this.datumrodenja = datumrodenja;
	}
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
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	public Date getDatumrodenja() {
		return datumrodenja;
	}
	public void setDatumrodenja(Date datumrodenja) {
		this.datumrodenja = datumrodenja;
	}
	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + "]";
	}
	
	
	
}
