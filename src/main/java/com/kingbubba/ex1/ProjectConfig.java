package com.kingbubba.ex1;

import com.kingbubba.ex1.beans.Person;
import com.kingbubba.ex1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kingbubba.ex1")
public class ProjectConfig {

    @Bean
    Vehicle v(){
        Vehicle v = new Vehicle();
        v.setMake("Chevy");
        v.setModel("Camaro");
        v.setYear(2013);
        return v;
    }

    @Bean
    Person p(Vehicle v){
        Person p = new Person();
        p.setName("John");
        p.setVehicle(v);
        return p;
    }

}

