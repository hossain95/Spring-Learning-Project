package com.example.relationship.oneToOne.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/persons")
    public Person savePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    @GetMapping("/persons")
    public List<Person> listPerson(){
        return personService.listPerson();
    }

    @PutMapping("/persons/buy-car")
    public Person buyCar(@RequestParam(name = "personId") Long personId, @RequestParam(name = "carId") Long carId){
        return personService.buyCar(personId, carId);
    }
}
