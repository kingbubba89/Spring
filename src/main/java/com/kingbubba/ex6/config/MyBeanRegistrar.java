package com.kingbubba.ex6.config;

import com.kingbubba.ex6.beans.Engine;
import com.kingbubba.ex6.beans.Vehicle;
import com.kingbubba.ex6.beans.bike;
import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;

import java.util.Random;

public class MyBeanRegistrar implements BeanRegistrar {


    @Override
    public void register(BeanRegistry registry, Environment env) {
        int num = new Random().nextInt(100);
        System.out.printf("Random number generated %d\n", num);
        if (num % 2 == 0) {
            System.out.println("Creating Vehicle bean with engine now");
            registry.registerBean("engine", Engine.class, engineSpec -> engineSpec.supplier(
                    ctx -> {
                        Engine engine = new Engine("Ls Motor", 62.F);
                        return engine;
                    }
            ));
            registry.registerBean("vehicle", Vehicle.class, spec -> spec.supplier(
                    context -> {
                        Vehicle vehicle = new Vehicle(context.bean(Engine.class));
                        vehicle.setName("Chevy Camaro");
                        return vehicle;
                    }
            ));
        } else {
            System.out.println("Creating Bike bean with engine now");
            registry.registerBean("engine", Engine.class, engineSpec -> engineSpec.supplier(
                    ctx -> {
                        Engine engine = new Engine("MotorBike engine", 2.0F);
                        return engine;
                    }
            ));

            registry.registerBean("bike", bike.class, spec -> spec.supplier(
                    context -> {
                        bike B = new bike(context.bean(Engine.class));
                        B.setName("Ducatti");
                        return B;
                    }
            ));
        }
    }
}