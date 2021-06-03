package com.example.jwt.common.factory;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextHelper  implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextHolder.getApplicationContextHolder().setApplicationContext(applicationContext);
    }
    public static ApplicationContext getApplicationContext(){
        return ApplicationContextHolder.getApplicationContextHolder().getApplicationContext();
    }
    public static <T> T getBean(String beanId){
        return (T)ApplicationContextHolder.getApplicationContextHolder().getApplicationContext().getBean(beanId);
    }
}
