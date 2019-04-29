package com.firstspring;

import com.firstspring.model.CarVaz;
import com.firstspring.model.CarZaz;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("ApplicationContext.xml")){
            CarVaz carSingleton = context.getBean("carVaz", CarVaz.class);
            System.out.println(carSingleton);
            carSingleton = context.getBean("carVaz", CarVaz.class);
            System.out.println(carSingleton);

            CarZaz carPrototype = context.getBean("carZaz", CarZaz.class);
            System.out.println(carPrototype);
            carPrototype.action();
            carPrototype = context.getBean("carZaz", CarZaz.class);
            System.out.println(carPrototype);
        }catch (Exception ex){
            ex.fillInStackTrace();
        }
    }
}
