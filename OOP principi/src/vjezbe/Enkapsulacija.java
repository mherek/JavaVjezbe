package vjezbe;

public  class Enkapsulacija {
	
	public Enkapsulacija() {
		
	}
public Enkapsulacija(String ime, String prezime) {
	this.ime=ime;
	this.prezime=prezime;
}

	private String ime;
	private String prezime;
	private String nadimak;
	
	
		
	

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
	public String getNadimak() {
		return nadimak;
	}
	public void setNadimak(String nadimak) {
		this.nadimak = nadimak;
	}
	

	
	
}
