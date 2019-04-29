package com.firstspring.model;

import com.firstspring.interfaces.Driver;
import com.firstspring.interfaces.Engine;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Log4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Car {
    @Autowired
    private Engine engine;
    @Autowired
    private Driver driver;


    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Car modelSingleton(){
        return new Car();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Car modelPrototype(){
        return new Car();
    }

    public void action() {
        driver.name();
        engine.start();
    }

    @PostConstruct
    private void postConstruct() {
        log.info("Bean is created");
    }

    @PreDestroy
    private void preDestroy() {
        log.info("Bean is destroyed");
    }
}
