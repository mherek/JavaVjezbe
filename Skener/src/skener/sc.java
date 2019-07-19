package skener;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class sc {

	public void Scanner() {
		Scanner sc = new Scanner(System.in);

	}
	public sc() {
		
	}

	public static final String FORMAT_DATUMA = "dd.MM.yyyy";

	public static String nextString() {
		String s = sc.nextString();
		while (true) {
			if (s.trim().length() == 0) {
				System.out.println("Obavezan unos");
				continue;
			}
			return s;
		}

	}

	public static int nextInt() {
		int i = sc.nextInt();
		while (true) {
			try {
				if (i <= 0) {
					System.out.println("Broja mora biti veci od 0");
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("Obavezan unos broja");
			}

		}

	}

	public static Date nextDate() {
		var df = new SimpleDateFormat(FORMAT_DATUMA);
		Date date = sc.nextDate();
	
		while(true) {
			
			try {
				return sc.nextDate();
				
			} catch (Exception e) {
				System.out.println("Krivi format" + df.format(new Date() + "\nPravilni format"));
				
			}
		}

	}

}