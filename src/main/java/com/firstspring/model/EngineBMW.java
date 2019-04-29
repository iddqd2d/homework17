package com.firstspring.model;

import com.firstspring.interfaces.Engine;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EngineBMW implements Engine {
    @Override
    public void start(){
        System.out.println("Drrrrdrrrrr");
    }
}
