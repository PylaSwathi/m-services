package com.ust.userService.feign;

import com.ust.userService.client.Booking;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name="bookingservice",url="http://localhost:9001/bookings")
public interface BookingClient {

    @PostMapping("/users/createBooking")
    Booking createBooking(@RequestBody Booking booking);

    @GetMapping("/getAllBookings")
    List<Booking> getAllBookings();

}
