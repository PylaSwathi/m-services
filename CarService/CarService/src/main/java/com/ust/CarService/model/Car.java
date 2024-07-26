package com.ust.CarService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "cars")
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    private Long carId;
    private String carModelName;
    private String carMake;
    private int rentPerDay;
    private boolean isAvailable;
    private String location;
//    private String userId;



}
