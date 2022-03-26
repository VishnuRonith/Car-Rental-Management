package com.examly.springapp.Service.ServiceImpl;

import java.util.List;

import com.examly.springapp.Dao.CarDao;
import com.examly.springapp.Entity.Cars;
import com.examly.springapp.Service.CarService;

import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    private CarDao cardao;

    public CarServiceImpl(CarDao cardao) {
        super();
        this.cardao = cardao;
    }

    @Override
    public List<Cars> getAllCars() {

        return cardao.findAll();
    }

    @Override
    public Cars getCarById(String id) {
        
        return cardao.findById(id).get();
    }

    @Override
    public Cars saveCar(Cars car) {
        
        return cardao.save(car);
    }

    @Override
    public Cars updateCar(Cars car,String id) {

        Cars existingCar = cardao.findById(id).orElseThrow();

        existingCar.setCarModel(car.getCarModel());
        existingCar.setCarNo(car.getCarNo());
        existingCar.setStatus(car.getStatus());
        
        return cardao.save(car);
    }

    @Override
    public void deleteCar(String id) {
        
        cardao.deleteById(id);
    }
    
}
