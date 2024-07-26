package com.ust.CarService.controller;

import com.ust.CarService.model.Car;
import com.ust.CarService.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/addcar")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
     return ResponseEntity.ok(carService.addCar(car));
    }

    @PutMapping("/updatecar/{id}")
    public ResponseEntity<Optional<Car>> updateCar(@PathVariable Long id, @RequestBody Car car) {
        Optional<Car> c = carService.findCarById(id);
        if(!c.isPresent()) {
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.ok(carService.updateCar(id,car));
        }

    }

    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
        Optional<Car> c = carService.findCarById(id);
        if(!c.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        else{
            carService.deleteCarById(id);
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/getAllCars")
    public ResponseEntity<List<Car>> getAllCars(){
        return ResponseEntity.ok(carService.getAllCars());

    }

    @GetMapping("users/getCarById/{id}")
    public ResponseEntity<Optional<Car>> getCarById(@PathVariable Long id){
        Optional<Car> c = carService.findCarById(id);
        if(c.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        else{
            return ResponseEntity.ok(c);
        }
    }


}
