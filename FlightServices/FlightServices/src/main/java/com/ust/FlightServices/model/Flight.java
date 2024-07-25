package com.ust.FlightServices.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="p-flight")
public class Flight {
    @Id
    private Long id;
    private String flightNumber;
    private String airline;
    private String origin;
    private String destination;
    private boolean available;
}
