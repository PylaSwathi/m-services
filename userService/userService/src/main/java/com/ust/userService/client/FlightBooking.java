package com.ust.userService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBooking {
    private Long bookingId;
    private String userId;
    private Long flightId;
    private LocalDateTime bookingDate;
}
