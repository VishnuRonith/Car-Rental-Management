package com.examly.springapp.Controller;

import java.util.List;

import com.examly.springapp.Entity.Cars;
import com.examly.springapp.Service.CarService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CarController {

    private CarService carservice;

    public CarController(CarService carservice) {
        super();
        this.carservice = carservice;
    }
    
    @GetMapping("/getCars")
    public List<Cars> getAllCars() {
        
        return carservice.getAllCars();
    }

    @PostMapping("/saveCar")
    public ResponseEntity<Cars> saveCar(@RequestBody Cars car) {

        return new ResponseEntity<Cars>(carservice.saveCar(car), HttpStatus.CREATED);
    }

    @PostMapping("/editCar")
    public ResponseEntity<Cars> updateCar(
       @RequestParam(name = "id") String id,@RequestBody Cars car) {

        return new ResponseEntity<Cars>(carservice.updateCar(car,id), HttpStatus.OK);
    }

    @GetMapping("/getCar")
    public ResponseEntity<Cars> getCarById(@RequestParam(name = "id") String id) {

        return new ResponseEntity<Cars>(carservice.getCarById(id), HttpStatus.OK);
    }

    @GetMapping("/deleteCar")
    public ResponseEntity<String> deleteCar(@RequestParam(name = "id") String id) {

        carservice.deleteCar(id);

        return new ResponseEntity<String>("Car Deleted!", HttpStatus.OK);
    }
}
