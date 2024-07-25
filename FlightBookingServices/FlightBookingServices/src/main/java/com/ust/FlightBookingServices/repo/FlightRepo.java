package com.ust.FlightBookingServices.repo;

import com.ust.FlightBookingServices.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<FlightBooking,Long> {
}
