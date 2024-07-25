package com.ust.FlightBookingServices.controller;


import com.ust.FlightBookingServices.model.FlightBooking;
import com.ust.FlightBookingServices.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flightbooking")
public class FlightController {
    @Autowired
    private FlightService bookingService;

    @PostMapping("/createBooking")
    public ResponseEntity<FlightBooking> createBooking(@RequestBody FlightBooking booking) {
        return ResponseEntity.ok(bookingService.createBooking(booking));
    }

    @GetMapping("/getAllBookings")
    public ResponseEntity<List<FlightBooking>> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }
}
