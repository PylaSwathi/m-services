package com.ust.userService.controller;


import com.ust.userService.client.Booking;
import com.ust.userService.client.FlightBooking;
import com.ust.userService.model.User;
import com.ust.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/getuserById")
    public ResponseEntity<Optional<User>> getUserById(String id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<User> updateuser(@RequestBody User user,@PathVariable String id) {
        Optional<User> u = userService.getUserById(id);
        if(u.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(userService.updateUser(user));
        }

    }

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{userId}/bookCar/{carId}")
    public ResponseEntity<Booking> bookCar(@PathVariable String userId, @PathVariable Long carId) {
        try {
            Booking booking = userService.bookCar(userId, carId);
            return ResponseEntity.ok(booking);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/getAllBookings")
    public ResponseEntity<List<Booking>> getAllBookings() {
        return ResponseEntity.ok(userService.getAllBookings());
    }


    @PostMapping("/{userId}/bookFlight/{flightId}")
    public ResponseEntity<FlightBooking> bookFlight(@PathVariable String userId, @PathVariable Long flightId) {
        try {
            FlightBooking booking = userService.bookFlight(userId, flightId);
            return ResponseEntity.ok(booking);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }


}

