package vjezbe;

public class StartEnkapsulacija {

	public static void main(String[] args) {
//1. Nacin
		Enkapsulacija e = new Enkapsulacija();
		e.setIme("Marko");
		e.setPrezime("Herek");
		System.out.println(e.getIme()+"  " +  e.getPrezime());
//2. Nacin
		e = new Enkapsulacija("Marko","Herek");
		System.out.println(e.getIme());
// Nasljedivanje		
Nasljedivanje n = new Nasljedivanje();
n.setIme("Nasljedio");
n.Nasljedio=true;
System.out.println("Ja sam nasljednik!");

//Polimorfizam



		
	}

}
