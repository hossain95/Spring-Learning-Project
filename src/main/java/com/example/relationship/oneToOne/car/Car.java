package com.example.relationship.oneToOne.car;

import com.example.relationship.oneToOne.person.Person;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brand", length = 40, nullable = false)
    private String brand;
    @Column(name = "price")
    private double price;

    @JsonIgnore
    @OneToOne(
            mappedBy = "car"
    )
    private Person person;

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
