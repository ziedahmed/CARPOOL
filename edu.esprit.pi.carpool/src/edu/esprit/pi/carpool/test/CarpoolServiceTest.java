package edu.esprit.pi.carpool.test;

import javax.naming.Context;
import javax.naming.InitialContext;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import edu.esprit.pi.ejb.domain.Carpool;
//import edu.esprit.pi.ejb.services.ClientServiceRemote;
import edu.esprit.pi.ejb.services.CarpoolServiceRemote;

public class CarpoolServiceTest {

	CarpoolServiceRemote CarpoolService;
	
	@Before
	public void setUp() throws Exception {
		
		Context ctx1 = new InitialContext();
		CarpoolService = (CarpoolServiceRemote) ctx1.
	  lookup("/edu.esprit.pi.ejb//CarpoolService!edu.esprit.pi.ejb.services.CarpoolServiceRemote");
	}

	@Test
	@Ignore
	
	
	public void itShouldCreate() {
		
		Carpool carpool = new Carpool();
		carpool.setStart_end(8);
		carpool.setTrip_date(9);
		carpool.setTime_between(4);
		carpool.setTrip_title("hello");
		carpool.setType_membre("passanger");
		
		CarpoolService.createCarpool(carpool);
	
	}
	
	@Test
	
	
	public void itShouldFindById() {
		
		Carpool carpool = CarpoolService.findCarpoolById(2);
		Assert.assertEquals("hello", carpool.getTrip_title());
	}
	
	@Test
	@Ignore
	
	public void itShouldUpdate() {
		
		Carpool carpool = new Carpool();
		carpool.setIdCarpool(1);
		carpool.setTrip_title("tunis-bizerte");
		carpool.setTime_between(7);
		carpool.setStart_end(45);
		carpool.setType_membre("passenger");
		carpool.setTrip_date(12);
		
		CarpoolService.updateCarpool(carpool);
		
		Assert.assertEquals("tunis-bizerte", CarpoolService.findCarpoolById(1).getTrip_title());
	}
	
	@Test
	
	@Ignore
	public void itShouldDelete() {
		
		int size = CarpoolService.getAll().size();
		Carpool carpool = new Carpool();
	
		carpool.setIdCarpool(1);
		CarpoolService.deleteCarpool(carpool);
		Assert.assertEquals(size-1,CarpoolService.getAll().size());
	}

}
