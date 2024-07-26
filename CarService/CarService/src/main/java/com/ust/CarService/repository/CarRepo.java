package com.ust.CarService.repository;

import com.ust.CarService.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car,Long> {

}
