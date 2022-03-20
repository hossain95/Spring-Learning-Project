package com.example.relationship.oneToOne.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Car saveCar(Car car){
        return carRepository.save(car);
    }

    public List<Car> listCar(){
        return carRepository.findAll();
    }
}
