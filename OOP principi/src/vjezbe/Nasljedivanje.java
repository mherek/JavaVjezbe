package vjezbe;

public  class Nasljedivanje extends Enkapsulacija {
	public Nasljedivanje() {

	}
	
	private String nadimak;
	
	public String getNadimak() {
		return nadimak;
	}
	
	public void Nasljedivanje(String nadimak) {
		this.nadimak=nadimak;
	}
	

	boolean Nasljedio;

	public boolean isNasljedio() {
		return Nasljedio;
	}

	public void setNasljedio(boolean nasljedio) {
		Nasljedio = nasljedio;
	}


}
