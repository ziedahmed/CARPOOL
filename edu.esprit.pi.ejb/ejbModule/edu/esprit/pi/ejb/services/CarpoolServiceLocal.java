package edu.esprit.pi.ejb.services;
import java.util.List;

import javax.ejb.Local;

import edu.esprit.pi.ejb.domain.Carpool;

@Local


public interface CarpoolServiceLocal {
	
	public void createCarpool(Carpool carpool);
	public Carpool findCarpoolById(int idCarpool);
	public void updateCarpool(Carpool carpool);
	public void deleteCarpool(Carpool carpool);
	public List<Carpool> getAll();

}
