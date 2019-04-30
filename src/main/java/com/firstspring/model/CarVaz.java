package com.firstspring.model;

import com.firstspring.interfaces.Car;
import com.firstspring.interfaces.Driver;
import com.firstspring.interfaces.Engine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Log4j
@ToString
@Getter
@Component
@AllArgsConstructor
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CarVaz implements Car {
    @Autowired(required = true)
    private Engine engine;

    @Autowired(required = true)
    private Driver driver;

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
