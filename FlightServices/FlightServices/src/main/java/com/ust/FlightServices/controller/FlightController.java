package com.ust.FlightServices.controller;


import com.ust.FlightServices.model.Flight;
import com.ust.FlightServices.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/addFlight")
    public ResponseEntity<Flight> addFlight(@RequestBody Flight flight) {
        return ResponseEntity.ok(flightService.addFlight(flight));
    }

    @PutMapping("/updateFlight/{id}")
    public ResponseEntity<Optional<Flight>> updateFlight(@PathVariable Long id, @RequestBody Flight flight) {
        Optional<Flight> f = flightService.findFlightById(id);
        if (!f.isPresent()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(flightService.updateFlight(id, flight));
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Void> deleteFlight(@PathVariable Long id) {
        Optional<Flight> f = flightService.findFlightById(id);
        if (!f.isPresent()) {
            return ResponseEntity.notFound().build();
        } else {
            flightService.deleteFlight(id);
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/getAllFlights")
    public ResponseEntity<List<Flight>> getAllFlights() {
        return ResponseEntity.ok(flightService.getAllFlights());
    }

    @GetMapping("/getFlightById/{id}")
    public ResponseEntity<Optional<Flight>> getFlightById(@PathVariable Long id) {
        Optional<Flight> f = flightService.findFlightById(id);
        if (f.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(f);
        }
    }



}
