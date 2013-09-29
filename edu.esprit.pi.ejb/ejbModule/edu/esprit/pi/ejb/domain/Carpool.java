package edu.esprit.pi.ejb.domain;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_Carpool")

public class Carpool implements Serializable{
	
	@Id
	@Column(name = "ID_Carpool")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCarpool;
	@Column(name = "start_end")
	private int start_end;
	@Column(name = "trip_date")
	private int trip_date;
	@Column(name = "time_between")
	private int time_between;
	@Column(name = "trip_title")
	private String trip_title;
	@Column(name = "type_membre")
	private String type_membre;

	public int getIdCarpool() {
		return idCarpool;
		
	}
	public void setIdCarpool(int idCarpool) {
		this.idCarpool = idCarpool;
	}
	public int getStart_end() {
		return start_end;
	}
	public void setStart_end(int start_end) {
		this.start_end = start_end;
	}
	public int getTrip_date() {
		return trip_date;
	}
	public void setTrip_date(int trip_date) {
		this.trip_date = trip_date;
	}
	public int getTime_between() {
		return time_between;
	}
	public void setTime_between(int time_between) {
		this.time_between = time_between;
	}
	public String getTrip_title() {
		return trip_title;
	}
	public void setTrip_title(String trip_title) {
		this.trip_title = trip_title;
	}
	public String getType_membre() {
		return type_membre;
	}
	public void setType_membre(String type_membre) {
		this.type_membre = type_membre;
	}
	
}




	
	


