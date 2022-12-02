package Domain.Repository;


import Domain.Aggregat.Mediatheque;

public interface Repository {
	Mediatheque FindById(int Id);
	void save(Mediatheque a);

}
