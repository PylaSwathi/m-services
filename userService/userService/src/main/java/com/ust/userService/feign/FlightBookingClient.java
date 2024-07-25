package com.ust.userService.feign;

import com.ust.userService.client.FlightBooking;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name="FlightBookingService",url="http://localhost:4542/flightbooking")
public interface FlightBookingClient {

    @PostMapping("/createBooking")
    public FlightBooking createBooking(@RequestBody FlightBooking booking);

    @GetMapping("/getAllBookings")
    public List<FlightBooking> getAllBookings();
}
