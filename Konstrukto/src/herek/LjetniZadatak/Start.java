package herek.LjetniZadatak;

import java.math.BigDecimal;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class Start {
	private Connection connection;
	PreparedStatement preparedStatement;


	

	private List<Osoba> osobe = new ArrayList<Osoba>();

	public Start() {
		connection = Baza.getConnection();

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			connection = DriverManager.getConnection
					("jdbc:mariadb://localhost/konstrukto?useUnicode=true&characterEncoding=UTF-8",
					"edunova","edunova");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		petlja: while (true) {
			izbornik();
			switch (Kontrola.unosInt("Odaberite radnju")) {
			case 1:
				unosOsobe();
				break;
			case 2:
			//	izlistajOsobe();
				break;
			case 3:
				//izmjenaOsobe();
				break;
			case 4:
				//brisanjeOsobe();
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






	private void unosOsobe() {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(" Insert into  radnik (ime, prezime) " + 
		" values (?.?) ");
			preparedStatement.setString(1, "Marko");
			preparedStatement.setString(2, "Herek");
			System.out.println(preparedStatement.executeUpdate());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
