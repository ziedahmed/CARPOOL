package edu.esprit.pi.ejb.services;

import java.util.List;

import javax.ejb.Remote;
import edu.esprit.pi.ejb.domain.Carpool;
@Remote
public interface CarpoolServiceRemote {
	public void createCarpool(Carpool carpool);
	public Carpool findCarpoolById(int idCarpool);
	public void updateCarpool(Carpool carpool);
	public void deleteCarpool(Carpool carpool);
	public List<Carpool> getAll(); 

}


