package com.kingbubba.ex1;

import com.kingbubba.ex1.beans.Car;
import com.kingbubba.ex1.beans.Engine;
import com.kingbubba.ex1.beans.Person;
import com.kingbubba.ex1.beans.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    static void main() {
       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var v = context.getBean(Vehicle.class);
        var p = context.getBean(Person.class);
        System.out.println("Vehicle name from Spring Context is " + v.getMake());
        System.out.println("Person from Spring Context is " + p.getName());
        System.out.println(p.getName() + " owns a " + p.getVehicle());

        var c = context.getBean(Car.class);
        var e = context.getBean(Engine.class);
        System.out.println("Car name from Spring Context is " + c.getMake());
        System.out.println("Engine from Spring Context is " + e.getName());
        System.out.printf("%s %s has a %s ", c.getModel(), c.getMake(),e.getName() );

    }
}
