package com.kingbubba.ex6.beans;

public class bike {
    private String name;
    private Engine engine;

    public bike(Engine engine) {
        System.out.println("Bike has been created with an engine");
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
        return "bike{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}