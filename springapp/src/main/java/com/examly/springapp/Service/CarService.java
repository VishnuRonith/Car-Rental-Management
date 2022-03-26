package com.examly.springapp.Service;

import java.util.List;

import com.examly.springapp.Entity.Cars;

public interface CarService {
    
    List<Cars> getAllCars();

    Cars saveCar(Cars car);

    Cars getCarById(String id);

    Cars updateCar(Cars car, String id);

    void deleteCar(String id);
}
