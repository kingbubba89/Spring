package com.kingbubba.ex6.beans;

public class Vehicle {
    private String name;
    private Engine engine;

    public Vehicle(Engine engine){
        this.engine = engine;
        System.out.println("Vehicle has been created with an engine");
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
