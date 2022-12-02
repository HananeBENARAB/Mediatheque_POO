package Infrastructure;

import java.util.HashMap;

import Domain.Aggregat.Mediatheque;
import Domain.Repository.Repository;

public class RepositoryImp implements Repository{
	private HashMap<Integer,Mediatheque> map;

	
	
	public RepositoryImp() {
		super();
		map = new HashMap<>();
	}

	@Override
	public Mediatheque FindById(int Id) {
		return map.get(Id);
		
	}

	@Override
	public void save(Mediatheque a) {
		map.put(a.getId(), a);
		
	}

	

	
}
