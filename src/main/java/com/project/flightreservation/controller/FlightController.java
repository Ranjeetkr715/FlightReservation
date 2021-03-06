package com.project.flightreservation.controller;


import com.project.flightreservation.entities.Flight;
import com.project.flightreservation.repo.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.Date;
import java.util.List;


@Controller
public class FlightController {

  @Autowired
  private FlightRepository flightRepository;


  @RequestMapping("findFlights")
  public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to,
                            @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") String departureDate,
                            ModelMap modelMap) {

    Date date = Date.valueOf(departureDate);
    List<Flight> flights = flightRepository.findFlights(from.toUpperCase(), to.toUpperCase(),date );

    modelMap.addAttribute("flights", flights);


    return "displayFlights";

  }
}
