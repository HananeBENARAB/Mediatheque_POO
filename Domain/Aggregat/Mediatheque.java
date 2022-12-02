package Domain.Aggregat;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import Domain.entity.Emprunt;
import Domain.valueObject.Adherent;
import Domain.valueObject.Document;


public class Mediatheque {
	private static int cpt=0;
	private final int id;
	private HashMap<Integer,Document>MapDoc;
	private HashMap<Integer,Adherent>MapAdherent;
	private HashMap<Integer,Emprunt>MapEmpr;
	
	
	
	public Mediatheque() {
		id=cpt;
		MapDoc= new HashMap<>();
		MapAdherent= new HashMap<>();
		MapEmpr= new HashMap<>();
		cpt++;
		
	}


	public int getId() {
		return this.id;
	}
	
	public void AddDoc(Document doc) {
		MapDoc.put(doc.getId(), doc);
	}
	
	public void DeleteDoc(Document doc) {
		MapDoc.remove(doc);
	}
	
	public void AddAdherent(Adherent Ad) {
		MapAdherent.put((int)Ad.getId(), Ad);
	}
	
	public void DeleteAdherent(Adherent Ad) {
		MapAdherent.remove(Ad);
	}
	
	
	
	@Override
	public String toString() {
		return "Mediatheque [  id=" + id + ", MapDoc=" + MapDoc + ", MapAdherent=" + MapAdherent
				+ ", MapEmpr=" + MapEmpr + "]";
	}


	public void emprunt(Document doc,Adherent adh) {
		Date dateAuj= new Date();
		 Calendar c = Calendar.getInstance();
	     c.setTime(dateAuj);

	     c.add(Calendar.MONTH, 1);
	     Date DateRetour = c.getTime();
	       
		Emprunt emp = new Emprunt((int)adh.getId(),adh,doc,dateAuj,DateRetour);
		MapEmpr.put(emp.getId(), emp);
		
	}
}
