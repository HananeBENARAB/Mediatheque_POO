package UI;

import Domain.valueObject.Adherent;
import Domain.valueObject.Document;
import Domain.valueObject.Document.Categorie;
import application.AggServices;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class main {

	public static void main(String[] args) {
		
		AggServices Ag = new AggServices();
		
		int IdMed = Ag.CreateMed();
		
		Calendar myCalendar = new GregorianCalendar(2014, 2, 11);
		Date myDate = myCalendar.getTime();

		Document doc1 = new Document(1, "GameOfThrones",myDate, "Hanane", Categorie.Film);
		Adherent Ad1= new Adherent(1,"Alexandre",23);
		
		
		Ag.AddAdherent(IdMed, Ad1);
		Ag.AddDoc(IdMed, doc1);
		Ag.empruntDoc(IdMed, Ad1, doc1);
		
		
		
		

	}

}
