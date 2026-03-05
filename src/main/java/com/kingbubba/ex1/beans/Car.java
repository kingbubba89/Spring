package com.kingbubba.ex1.beans;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String make;
    private String model;

    @Autowired
    private final Engine engine;

    public Car(Engine engine){
        this.engine = engine;
        System.out.println("Car has been created");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @PostConstruct
    public void intitialize() {
        this.make = "Ford";
        this.model = "Mustang";
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
