package Domain.valueObject;

import java.util.Date;

public class Document {
	private final int id;
	private final String titre;
	private final Date DatePublication;
	private final String Auteur;
	public enum Categorie {Film,Livre,CD}
	private Categorie categorie;
	
	
	public Document(int id,String titre, Date datePublication, String auteur, Categorie categorie) {
		super();
		this.id=id;
		this.titre = titre;
		DatePublication = datePublication;
		Auteur = auteur;
		this.categorie = categorie;
	}


	public String getTitre() {
		return titre;
	}


	public Date getDatePublication() {
		return DatePublication;
	}


	public String getAuteur() {
		return Auteur;
	}


	public Categorie getCategorie() {
		return categorie;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Document [titre=" + titre + ", DatePublication=" + DatePublication + ", Auteur=" + Auteur
				+ ", categorie=" + categorie + "] ";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Auteur == null) ? 0 : Auteur.hashCode());
		result = prime * result + ((DatePublication == null) ? 0 : DatePublication.hashCode());
		result = prime * result + ((categorie == null) ? 0 : categorie.hashCode());
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		if (Auteur == null) {
			if (other.Auteur != null)
				return false;
		} else if (!Auteur.equals(other.Auteur))
			return false;
		if (DatePublication == null) {
			if (other.DatePublication != null)
				return false;
		} else if (!DatePublication.equals(other.DatePublication))
			return false;
		if (categorie != other.categorie)
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
	
	
	
	
	

}
