package com.ust.BookingService.repository;

import com.ust.BookingService.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Booking, Integer> {
}
