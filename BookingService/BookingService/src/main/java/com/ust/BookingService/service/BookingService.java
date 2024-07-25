package com.ust.BookingService.service;


import com.ust.BookingService.model.Booking;
import com.ust.BookingService.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookRepo repo;

    public Booking createBooking(Booking booking) {
        return repo.save(booking);
    }

    public List<Booking> getAllBookings() {
        return repo.findAll();
    }
}
