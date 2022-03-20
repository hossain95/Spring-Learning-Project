package com.example.relationship.oneToOne.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/cars")
    public Car saveCar(@RequestBody Car car){
        return carService.saveCar(car);
    }

    @GetMapping("/cars")
    public List<Car> listCar(){
        return carService.listCar();
    }
}
