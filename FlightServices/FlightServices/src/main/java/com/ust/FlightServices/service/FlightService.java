package com.ust.FlightServices.service;

import com.ust.FlightServices.model.Flight;
import com.ust.FlightServices.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    private FlightRepo repo;

    public Flight addFlight(Flight flight) {
        return repo.save(flight);
    }

    public Optional<Flight> updateFlight(Long id, Flight flight) {
        return Optional.of(repo.save(flight));
    }

    public void deleteFlight(Long id) {
        repo.deleteById(id);
    }

    public Optional<Flight> findFlightById(Long id) {
        return repo.findById(id);
    }

    public List<Flight> getAllFlights() {
        return repo.findAll();
    }
}
