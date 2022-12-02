package application;

import Domain.Aggregat.Mediatheque;
import Domain.Repository.Repository;
import Domain.valueObject.Adherent;
import Domain.valueObject.Document;
import Infrastructure.RepositoryImp;

public class AggServices {
	private final Repository Rep;
	
	
	
	public AggServices() {
		this.Rep= new RepositoryImp();
	}
	
	public int CreateMed() {
		Mediatheque med = new Mediatheque();
		this.Rep.save(med);
		return med.getId();
		
	}
	
	public void AddDoc(int id,Document doc) {
		Mediatheque med = this.Rep.FindById(id);
		med.AddDoc(doc);
		this.Rep.save(med);
		
	}
	
	public void deleteDoc(int id, Document doc) {
		Mediatheque med = this.Rep.FindById(id);
		med.DeleteDoc(doc);
		this.Rep.save(med);
		
	}
	
	public void AddAdherent(int id,Adherent Adh) {
		Mediatheque med = this.Rep.FindById(id);
		med.AddAdherent(Adh);
		this.Rep.save(med);
		
	}	

	public void deleteAdherent(int id, Adherent Adh) {
		Mediatheque med = this.Rep.FindById(id);
		med.DeleteAdherent(Adh);
		this.Rep.save(med);
		
	}
	
	public void empruntDoc(int Id,Adherent Adh, Document doc) {
		Mediatheque med = this.Rep.FindById(Id);
		med.emprunt(doc, Adh);
		System.out.println(med.toString());
		this.Rep.save(med);
		
	}
}
