package edu.esprit.pi.ejb.services;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



import edu.esprit.pi.ejb.domain.Carpool;

@Stateless

public class CarpoolService implements CarpoolServiceRemote, CarpoolServiceLocal{


	@PersistenceContext(unitName = "carpoolUnit")
	EntityManager em;
	
    public CarpoolService() {
    }

	@Override
	public void createCarpool(Carpool carpool) {
		em.persist(carpool);
	}

	@Override
	public Carpool findCarpoolById(int idCarpool) {
		return em.find(Carpool.class, idCarpool);
	}

	@Override
	public void updateCarpool(Carpool Carpool) {
		em.merge(Carpool);
		
	}

	@Override
	public void deleteCarpool(Carpool carpool) {
		em.remove(em.merge(carpool));
		
	}

	@Override
	public List<Carpool> getAll() {
		List<Carpool> resultList = em.createQuery("SELECT c FROM Carpool c",Carpool.class).getResultList();
		return resultList;
	}
	
	

}



	
	


