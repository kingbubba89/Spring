package com.kingbubba.ex5.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("My cappucino coffee")
@Primary
public class Cappucino implements Coffee {
    String name;

    @Override
    public String makeCoffee() {
        return "Cappucino being made";
    }


    @Override
    public String toString() {
        return "Cappucino{" +
                "name='" + name + '\'' +
                '}';
    }
}



