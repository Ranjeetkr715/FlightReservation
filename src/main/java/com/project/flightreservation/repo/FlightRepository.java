package com.project.flightreservation.repo;

import com.project.flightreservation.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.sql.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

  @Query("from Flight where departureCity=:departureCity and ArrivalCity=:ArrivalCity and dateOfDeparture=:departureDate")
  List<Flight> findFlights(@Param("departureCity") String from, @Param("ArrivalCity") String to, @Param("dateOfDeparture") Date departureDate);

}
