package com.example.relationship.oneToOne.person;

import com.example.relationship.oneToOne.car.Car;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;
    @Column(name = "contact", length = 11, nullable = false, unique = true)
    private String contact;

    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "car_id")
    private Car car;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
