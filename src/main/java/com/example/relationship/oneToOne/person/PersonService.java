package com.example.relationship.oneToOne.person;

import com.example.relationship.oneToOne.car.Car;
import com.example.relationship.oneToOne.car.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private CarRepository carRepository;

    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public List<Person> listPerson(){
        return personRepository.findAll();
    }

    public Person buyCar(Long personId, Long carId){
        Person person = personRepository.findById(personId).get();
        Car car = carRepository.findById(carId).get();
        person.setCar(car);
        return personRepository.save(person);
    }
}
