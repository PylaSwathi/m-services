package com.ust.userService.service;


import com.ust.userService.client.Booking;
import com.ust.userService.client.Car;
import com.ust.userService.client.Flight;
import com.ust.userService.client.FlightBooking;
import com.ust.userService.feign.BookingClient;
import com.ust.userService.feign.CarClient;
import com.ust.userService.feign.FlightBookingClient;
import com.ust.userService.feign.FlightClient;
import com.ust.userService.model.User;
import com.ust.userService.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private BookingClient bookingClient;

    @Autowired
    private CarClient carClient;

    @Autowired
    private FlightClient flightClient;

    @Autowired
    private FlightBookingClient flightBookingClient;



    public List<User> getAllUsers() {
           return repo.findAll();
    }

    public Optional<User> getUserById(String id) {
        return repo.findById(id);
    }

    public User updateUser(User user) {
        return repo.save(user);
    }

    public void deleteUser(String id) {
        repo.deleteById(id);
    }


    public User createUser(User user) {
        return repo.save(user);
    }



    public Booking bookCar(String userId, Long carId) {
        // Fetch the car to ensure it exists and is available
        Car car = carClient.getCarById(carId);
        System.out.println(car);
        if (car == null || !car.isAvailable()) {
            System.out.println("Car not available");
            throw new RuntimeException("Car not available");
        }
        // Create the booking
        Booking booking = new Booking();
        booking.setUserId(userId);
        booking.setCarId(carId);
        booking.setBookingDate(LocalDateTime.now());
        System.out.println(booking);

        return bookingClient.createBooking(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingClient.getAllBookings();
    }

    public FlightBooking bookFlight(String userId, Long flightId) {
        // Fetch the flight to ensure it exists and is available
        Flight flight = flightClient.getFlightById(flightId);
        System.out.println(flight);
        if (flight == null || !flight.isAvailable()) {
            throw new RuntimeException("Flight not available");
        }

        // Create the booking
        FlightBooking booking = new FlightBooking();
        booking.setUserId(userId);
        booking.setFlightId(flightId);
        booking.setBookingDate(LocalDateTime.now());
        System.out.println(booking);

        return flightBookingClient.createBooking(booking);
    }
}





