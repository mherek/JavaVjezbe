package vjezbe;

import java.util.ArrayList;
import java.util.List;

public class Liste extends Enkapsulacija {

	public Liste() {
		
		List<Enkapsulacija> lista = new ArrayList<>();
		Enkapsulacija e = new Nasljedivanje();
		e.setIme("Ja sam lista!");
		System.out.println(e.getIme().toString());
		
	}
	public static void main(String[] args) {
		new Liste();
	}
	@Override
	public String getTip() {
		System.out.println("Ja sam lista!");
		return null;
	}
}
