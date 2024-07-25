package com.ust.userService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    private int bookingId;
    private String userId;
    private Long carId;
    private LocalDateTime bookingDate;
}
