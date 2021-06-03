package com.example.jwt.application.task;

import com.example.jwt.common.event.OrderPublisher;
import com.example.jwt.common.thread.ThreadExecutorSupport;
import com.example.jwt.domain.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 作业调度springboot  启动类需要加注解 @EnableScheduling
 */
@Component
@EnableScheduling
@Slf4j
public class Schedule {
    @Autowired
    private ThreadExecutorSupport threadExecutorSupport;
    @Autowired
    private OrderPublisher orderPublisher;
    Order order=new Order();
    @Scheduled(cron = "0/5 * * * * ?")//5秒执行一次
    public void run(){
        System.out.println("scheduled");
        try {
            long s=System.currentTimeMillis();
            threadExecutorSupport.execute("asyService","");
            orderPublisher.publishOrder(order);
            long e=System.currentTimeMillis();
            System.out.println(e-s);
        }catch (Exception e){
            log.info(e.getMessage());
        }
    }
}


