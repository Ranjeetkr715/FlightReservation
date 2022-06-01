package com.project.flightreservation.entities;

import java.security.Timestamp;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Flight extends AbstractEntity {
	
	private String flightNumber;
	private String operatingAirlines;
	private String departureCity ;
	private String ArrivalCity ;
//	@Temporal(TemporalType.DATE)
	//@JsonFormat(pattern = "YYYY-MM-DD")
	private Date dateOfDeparture ;
	private Timestamp estimatedDepartureDate;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return ArrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		ArrivalCity = arrivalCity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedDepartureDate() {
		return estimatedDepartureDate;
	}
	public void setEstimatedDepartureDate(Timestamp estimatedDepartureDate) {
		this.estimatedDepartureDate = estimatedDepartureDate;
	}
	
}
