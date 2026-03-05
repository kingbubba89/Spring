package com.kingbubba.ex5;


import com.kingbubba.ex5.beans.Cappucino;
import com.kingbubba.ex5.beans.Coffee;
import com.kingbubba.ex5.beans.CoffeeShop;
import com.kingbubba.ex5.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main(){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var coffeeShop = context.getBean(CoffeeShop.class);
        Coffee coffee =  coffeeShop.getCoffee();
        System.out.println(coffee.makeCoffee());


    }
}
