package com.ust.userService.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Long carId;
    private String carModelName;
    private String carMake;
    private int rentPerDay;
    private boolean isAvailable;
    private String location;
//    private String userId;
}
