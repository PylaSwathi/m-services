package com.ust.userService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    private Long id;
    private String flightNumber;
    private String airline;
    private String origin;
    private String destination;
    private boolean available;
}
