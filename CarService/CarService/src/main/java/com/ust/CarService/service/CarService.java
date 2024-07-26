package com.ust.CarService.service;

import com.ust.CarService.model.Car;
import com.ust.CarService.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepo repo;

    public Car addCar(Car car) {
        return repo.save(car);
    }

    public Optional<Car> updateCar(Long id , Car car) {
       return Optional.ofNullable(repo.save(car));


    }

    public void deleteCar(Long id) {
        repo.deleteById(id);
    }

    public Optional<Car> findCarById(Long id) {
        return repo.findById(id);
    }


    public void deleteCarById(Long id) {
         repo.deleteById(id);
    }



    public List<Car> getAllCars() {
        return repo.findAll();
    }
}


