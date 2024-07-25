package com.ust.FlightBookingServices.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="flight_booking")
    public class FlightBooking {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long bookingId;
        private String userId;
        private Long flightId;
        private LocalDateTime bookingDate;
    }

