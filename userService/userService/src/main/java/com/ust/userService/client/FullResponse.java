package com.ust.userService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    private String id;
    private String userName;
    private String email;
    private String location;
    private String phoneNumber;
    private List<Car> cars;
}
