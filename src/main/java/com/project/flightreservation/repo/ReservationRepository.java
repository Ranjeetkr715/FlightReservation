package com.project.flightreservation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
