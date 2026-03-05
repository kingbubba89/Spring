package com.kingbubba.ex5.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
 public class CoffeeShop {

    private final Coffee coffee;


    public CoffeeShop(@Qualifier("My espresso coffee")Coffee coffee){
        this.coffee = coffee;
    }


    public Coffee getCoffee() {
        return coffee;
    }
}
