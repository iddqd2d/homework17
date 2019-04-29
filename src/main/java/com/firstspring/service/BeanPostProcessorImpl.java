package com.firstspring.service;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Log4j
@Component
public class BeanPostProcessorImpl implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object object, String name) throws BeansException {
        log.info("postProcessBeforeInitialization: " + name);
        return object;
    }

    @Override
    public Object postProcessAfterInitialization(Object object, String name) throws BeansException {
        log.info("postProcessAfterInitialization: " + name);
        return object;
    }
}
