package com.firstspring;

import com.firstspring.model.CarVaz;
import com.firstspring.model.CarZaz;
import lombok.extern.log4j.Log4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Log4j
public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml")){
            CarVaz carSingleton = context.getBean("carVaz", CarVaz.class);
            log.info(carSingleton.getDriver());
            carSingleton = context.getBean("carVaz", CarVaz.class);
            log.info(carSingleton.getDriver());

            CarZaz carPrototype = context.getBean("carZaz", CarZaz.class);
            log.info(carPrototype.getDriver());
            carPrototype = context.getBean("carZaz", CarZaz.class);
            log.info(carPrototype.getDriver());
        }catch (Exception ex){
            log.error(ex);
        }
    }
}
