package com.kingbubba.ex5.beans;

import org.springframework.stereotype.Component;

@Component("My espresso coffee")
public class espresso implements Coffee{

    @Override
    public String makeCoffee() {
        return "Espresso being made";
    }
}
