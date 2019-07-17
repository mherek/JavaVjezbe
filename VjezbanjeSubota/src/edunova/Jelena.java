package edunova;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class Jelena {

	public Jelena() {
		try {

			DocumentBuilderFactory tvornica = DocumentBuilderFactory.newInstance();
			DocumentBuilder b = tvornica.newDocumentBuilder();
			Document doc = b.parse(new File("podaci.xml"));

			obradi(doc.getDocumentElement());

			System.out.println(ukupno);

			// System.out.println(doc.getDocumentElement().getNodeName());
			// Node cvor,cvor1;
			// for(int i=0;i<doc.getDocumentElement().getChildNodes().getLength();i++) {
			//
			// cvor = doc.getDocumentElement().getChildNodes().item(i);
			//
			// System.out.println(cvor.getNodeName());
			// //System.out.println(cvor.hasChildNodes());
			//
			// for(int j=0;j<cvor.getChildNodes().getLength();j++) {
			// cvor1 = cvor.getChildNodes().item(j);
			// System.out.println(cvor1.getNodeName());
			// if(cvor1.getNodeType()==Node.TEXT_NODE) {
			// System.out.println(cvor1.getNodeValue());
			// }
			// }
			//
			// }

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		new Jelena();
	}

	int ukupno = 0;

	private void obradi(Node cvor) {
		if (!cvor.hasChildNodes()) {
			System.out.println(">>" + cvor.getNodeValue() + "<<");
			try {
				ukupno += Integer.parseInt(cvor.getNodeValue().trim());
			} catch (Exception e) {
				
			}

		}
		for (int j = 0; j < cvor.getChildNodes().getLength(); j++) {
			obradi(cvor.getChildNodes().item(j));
		}
	}

}
