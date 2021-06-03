package com.example.jwt.common.factory;

import org.springframework.context.ApplicationContext;

public class ApplicationContextHolder {
    private static ApplicationContextHolder applicationContextHolder=new ApplicationContextHolder();
    private ApplicationContext applicationContext;
    public ApplicationContext getApplicationContext(){
        return applicationContext;
    }
    public void setApplicationContext(ApplicationContext applicationContext){
        this.applicationContext=applicationContext;
    }
    public static ApplicationContextHolder getApplicationContextHolder(){
        return applicationContextHolder;
    }
}
