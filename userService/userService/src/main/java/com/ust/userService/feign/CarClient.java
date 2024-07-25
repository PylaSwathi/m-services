package com.ust.userService.feign;


import com.ust.userService.client.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CarService",url="http://localhost:4537/cars")
public interface CarClient {

    @GetMapping("/users/getCarById/{id}")
    Car getCarById(@PathVariable Long id);
}
