package com.firstspring;

import com.firstspring.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Car carSingleton = (Car)context.getBean("modelSingleton");
        System.out.println(carSingleton);
        carSingleton = (Car)context.getBean("modelSingleton");
        System.out.println(carSingleton);

        Car carPrototype = (Car)context.getBean("modelPrototype");
        System.out.println(carPrototype);
        carPrototype = (Car)context.getBean("modelPrototype");
        System.out.println(carPrototype);
    }
}
