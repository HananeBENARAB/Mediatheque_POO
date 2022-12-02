package Domain.entity;

import java.util.Date;

import Domain.valueObject.Document;

public class Emprunt {
	private final int id ;
	private Domain.valueObject.Adherent Adherent;
	private Date DateEmprunt;
	private Date DateRetour;
	private Document Document;
	private static int duree=15;
	
	
	public Emprunt(int id, Domain.valueObject.Adherent adherent, Document document, Date dateEmprunt,Date dateRetour) {
		super();
		this.id = id;
		Adherent = adherent;
		DateEmprunt = dateEmprunt;
		DateRetour = dateRetour;
		Document=document;
	}



	public Domain.valueObject.Adherent getAdherent() {
		return Adherent;
	}


	public void setAdherent(Domain.valueObject.Adherent adherent) {
		Adherent = adherent;
	}


	public Date getDateEmprunt() {
		return DateEmprunt;
	}


	public void setDateEmprunt(Date dateEmprunt) {
		DateEmprunt = dateEmprunt;
	}


	public Date getDateRetour() {
		return DateRetour;
	}


	public void setDateRetour(Date dateRetour) {
		DateRetour = dateRetour;
	}


	public int getId() {
		return id;
	}



	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", Adherent=" + Adherent + ", DateEmprunt=" + DateEmprunt + ", DateRetour="
				+ DateRetour + ", Document=" + Document + "]";
	}

	
	
	
	
}
