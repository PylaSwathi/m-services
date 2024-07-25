package com.ust.FlightServices.repository;

import com.ust.FlightServices.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<Flight,Long> {
}
