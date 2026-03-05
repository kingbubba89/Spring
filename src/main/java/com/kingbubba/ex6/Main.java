package com.kingbubba.ex6;

import com.kingbubba.ex6.beans.Engine;
import com.kingbubba.ex6.beans.Vehicle;
import com.kingbubba.ex6.beans.bike;
import com.kingbubba.ex6.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main(){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Available beans\n");

        if (context.containsBean("engine")){
            Engine engine = context.getBean(Engine.class);
            System.out.printf("Engine created is a %fL %s\n",engine.getSize(), engine.getName());;
        }

        if(context.containsBean("vehicle")){
            Vehicle vehicle = context.getBean(Vehicle.class);
            System.out.printf("Vehicle created is %s with a %s", vehicle.getName(), vehicle.getEngine().getName());

        }
        if(context.containsBean("bike")){
            bike B = context.getBean(bike.class);
            System.out.println(B.toString());
        }
    }
}
