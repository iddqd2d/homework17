package com.firstspring.model;

import com.firstspring.interfaces.Driver;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DriverUa implements Driver {
    @Override
    public void name (){
        System.out.println("I`m Ben");
    }
}
