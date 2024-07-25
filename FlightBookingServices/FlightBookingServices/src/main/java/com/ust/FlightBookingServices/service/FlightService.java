package com.ust.FlightBookingServices.service;


import com.ust.FlightBookingServices.model.FlightBooking;
import com.ust.FlightBookingServices.repo.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepo repo;

    public FlightBooking createBooking(FlightBooking booking) {
        return repo.save(booking);
    }

    public List<FlightBooking> getAllBookings() {
        return repo.findAll();
    }
}
