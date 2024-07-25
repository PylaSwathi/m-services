package com.ust.userService.feign;


import com.ust.userService.client.Car;
import com.ust.userService.client.Flight;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="FlightService",url="http://localhost:4540/flights")
public interface FlightClient {

    @GetMapping("/users/getFlightById/{id}")
    Flight getFlightById(@PathVariable Long id);

}