package com.project.flightreservation.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight,Long> {

	@Query("from Flight where departureCity=:departureCity and ArrivalCity=:ArrivalCity and dateOfDeparture=:dateOfDeparture")
	List<Flight>  findFlights(@Param("departureCity") String from,@Param("ArrivalCity") String to,@Param("dateOfDeparture") Date departureDate);


}
